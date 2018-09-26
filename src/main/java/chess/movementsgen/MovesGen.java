package chess.movementsgen;

import chess.*;
import chess.controllers.BitPositionController;
import java.util.Arrays;

import static chess.constants.Constants.EMPTY_BIT_POSITION;
import static chess.constants.Constants.VERT_ALL;


public class MovesGen {

    private BitPositionController bitPositionController;

    public MovesGen () {
        bitPositionController = new BitPositionController ();
    }

    private static int tempPositionPointer;

    private static final int TEMP_POSITION_SIZE = 100;

    private static Position [] tempPositions = new Position [TEMP_POSITION_SIZE];

    private static Figure [] tempFigures = new Figure [64];

    private static BitPosition tempAntiBitPosition = new BitPosition (new byte [8]);

    private static BitPosition tempKingBitPosition = new BitPosition (new byte [8]);

    private static BitPosition tempCheckValidBitPosition = new BitPosition (new byte [8]);

    private static BitPosition tempCheckAttackBitPosition = new BitPosition (new byte [8]);

    private static BitPosition myBitPosition = new BitPosition(new byte [8]);
    private static BitPosition antiBitPosition = new BitPosition(new byte [8]);
    private static BitPosition mixBitPosition = new BitPosition(new byte [8]);
    private static BitPosition [] bitPositionsAttaksBank1000 = new BitPosition [1000];
    private static BitPosition [] bitPositionsMovesBank1000 = new BitPosition [1000];
    private static BitPosition [] bitPositionsResultBank1000 = new BitPosition [1000];

    static {
        for (int i = 0; i < 64; i++) {
            tempFigures [i] = new Figure(Figures.EMPTY, Cells.getByValue(i), null);
        }
        for (int i = 0; i < 1000; i++) {
            bitPositionsAttaksBank1000 [i] = new BitPosition(new byte [8]);
            bitPositionsMovesBank1000 [i] = new BitPosition(new byte [8]);
            bitPositionsResultBank1000 [i] = new BitPosition(new byte [8]);
        }
        for (int i = 0; i < TEMP_POSITION_SIZE; i++) {
            tempPositions [i] = new Position();
        }
    }

    /**
     *
     * @param position
     * @param fromBank
     * @param sizeBank
     * @param bank
     * @param color
     * @return
     */
    public int generate (Position position,
                          int fromBank,
                          int sizeBank,
                          Position [] bank,
                          Color color) {
        // формирование списка фигур
        fillTempFigures(position);
        // сброс позиций
        resetBitPosition(myBitPosition);
        resetBitPosition(antiBitPosition);
        // в bitPosition - позиция моих фигур
        bitPositionController.position2BitPosition(position, myBitPosition, color);
        // в antiBitPosition - позиция чужих фигур
        bitPositionController.position2BitPosition(position, antiBitPosition, not(color));
        // суммарная позиция
        orBitPositions(mixBitPosition, myBitPosition, antiBitPosition);
        // установка указателя позиций в 0
        tempPositionPointer = 0;
        // мне нужно пробежать по всем своим фигурам
        Arrays.stream(tempFigures)
                .filter(Figure::notEmpty)
                .filter(c -> c.getColor().equals(color))
                .forEach(item -> {
                    int cell = item.getCell().getValue();
                    andBitPositions(
                            bitPositionsAttaksBank1000 [cell],
                            antiBitPosition,
                            item.getAttack());

                    bitPositionsMovesBank1000 [cell].copy(item.getMovesOnly());
                    // валидация хода
                    if (!isEmptyBitPosition(bitPositionsMovesBank1000 [cell])) {
                        // если позиция невалидна, то обнуляем
                        if (! isPositionValid(bitPositionsMovesBank1000 [cell], mixBitPosition, myBitPosition, item)) {
                            bitPositionsMovesBank1000 [cell].copy(EMPTY_BIT_POSITION);
                        }
                    }
                    // итог без шахов
                    orBitPositions(
                            bitPositionsResultBank1000 [cell],
                            bitPositionsAttaksBank1000 [cell],
                            bitPositionsMovesBank1000 [cell]);
                    // фильтр шахов
                    doMoves(tempFigures, item, bitPositionsResultBank1000 [cell], position);
                });
        for (int i = 0; i < tempPositionPointer; i++) {
            if (fromBank + i < sizeBank) {
                bank [fromBank + i].copy(tempPositions [i]);
            }
        }
        return tempPositionPointer;
    }

    private void fillTempFigures (Position position) {
        int j=0;
        for (int i = 0; i < 64; i++) {
            tempFigures [i].setValue(Figures.EMPTY);

            Figures item = position.getBoard() [i];
            if (item != Figures.EMPTY) {
                tempFigures [j].setCell(Cells.getByValue(i));
                switch (item) {
                    case WHITE_KING: case WHITE_KNIGHT: case WHITE_PAWN:
                        tempFigures [j].setColor(Color.WHITE);
                        break;

                    case BLACK_KING: case BLACK_KNIGHT: case BLACK_PAWN:
                        tempFigures [j].setColor(Color.BLACK);
                }
                tempFigures [j].setValue(item);
                j++;
            }
        }
    }

    private Color not (Color inp) {
        return inp == Color.BLACK ? Color.WHITE : Color.BLACK;
    }

    private void doMoves (Figure [] figures, Figure item, BitPosition bitPosition, Position position) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                byte bCol = bitPositionController.column2Byte(col);
                if ((bitPosition.getBoard()[row] & bCol) != 0) {
                    final int from = item.getCell().getValue();
                    final int to = row * 8 + col;
                    tempPositions [tempPositionPointer].copy(position);
                    tempPositions [tempPositionPointer].getBoard() [from] = Figures.EMPTY;
                    tempPositions [tempPositionPointer].getBoard() [to] = item.getValue();
                    // найдем нашего короля
                    findKingPosition (tempPositions [tempPositionPointer], item.getColor());
                    // сбросить бой чужих
                    resetBitPosition(tempAntiBitPosition);
                    // проверить на шах
                    final Color antiColor = not(item.getColor());
                    Arrays.stream(figures)
                            .filter(Figure::notEmpty)
                            .filter(c -> c.getColor().equals(antiColor))
                            .filter(c -> c.getCell().getValue() != to)
                            .forEach(figure -> {
                                orBitPositions(
                                        tempAntiBitPosition,
                                        tempAntiBitPosition,
                                        figure.getAttack());
                            });
                    // tempAntiBitPosition - бой чужих
                    andBitPositions(tempAntiBitPosition, tempAntiBitPosition, tempKingBitPosition);
                    if (isBitPositionEmpty(tempAntiBitPosition)) {
                        // шаха нет, переходим к следующему ходу
                        tempPositionPointer++;
                    }
                }
            }
        }
    }

    public boolean checkShah(Position position, Color myColor) {
        // формирование списка фигур
        fillTempFigures(position);
        // проверить на шах
        final Color antiColor = not(myColor);
        // найдем нашего короля
        findKingPosition (position, myColor);
        // сбросить бой чужих
        resetBitPosition(tempAntiBitPosition);
        // проверить на шах
        Arrays.stream(tempFigures)
                .filter(Figure::notEmpty)
                .filter(c -> c.getColor().equals(antiColor))
                .forEach(figure -> {
                    orBitPositions(
                            tempAntiBitPosition,
                            tempAntiBitPosition,
                            figure.getAttack());
                });
        // tempAntiBitPosition - бой чужих
        andBitPositions(tempAntiBitPosition, tempAntiBitPosition, tempKingBitPosition);
        return !isEmptyBitPosition(tempAntiBitPosition);
    }

    private void findKingPosition (Position position, Color color) {
        resetBitPosition(tempKingBitPosition);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                int index = row * 8 + col;
                if (position.getBoard()[index] == Figures.WHITE_KING) {
                    if (color == Color.WHITE) {
                        tempKingBitPosition.getBoard()[row] |= bitPositionController.column2Byte(col);
                    }
                } else if (position.getBoard()[index] == Figures.BLACK_KING) {
                    if (color == Color.BLACK) {
                        tempKingBitPosition.getBoard()[row] |= bitPositionController.column2Byte(col);
                    }
                }
            }
        }
    }

    // для пешек - не перепрыгиваем через фигуры

    /**
     *
     * @param moves
     * @param mixBitPosition
     * @param item
     * @return
     */
    private boolean isPositionValid (BitPosition moves, final BitPosition mixBitPosition, final BitPosition myBitPosition, final Figure item) {
        // имеет смысл проверять только для пешек (в данной реализации)
        switch (item.getValue()) {
            case WHITE_PAWN: case BLACK_PAWN:
                if (!checkIfPawnsAttack(moves, item)) {
                    // это не атака
                    andBitPositions(tempCheckValidBitPosition, moves, mixBitPosition);
                    if (isEmptyBitPosition(tempCheckValidBitPosition)) {
                        // не встретили препядствий, все ходы допустимы
                        return true;
                    } else {
                        xorBitPositions(moves, tempCheckValidBitPosition, moves);
                        calcValidMovesOnVert(moves, item);
                        return ! isEmptyBitPosition(moves);
                    }
                }
                return true;
            case BLACK_KING: case WHITE_KING: case WHITE_KNIGHT: case BLACK_KNIGHT:
                andBitPositions(tempCheckValidBitPosition, myBitPosition, moves);
                xorBitPositions(moves, tempCheckValidBitPosition, moves);
                return ! isEmptyBitPosition(moves);
        }
        return false;
    }

    /**
     *
     * @param availableMoves
     * @param item
     * @return
     */
    private void calcValidMovesOnVert(BitPosition availableMoves, final Figure item) {
        int column = item.getCell().getValue() % 8, row;
        byte availableMovesColumn = 0, columnByte = bitPositionController.column2Byte(column), shift = 0, result = 0;
        for (row = 0; row < 8; row++) {
            if ((columnByte & availableMoves.getBoard() [row]) != 0) {
                shift = bitPositionController.column2Byte(row);
                availableMovesColumn |= shift;
            }
        }
        row = item.getCell().getValue() / 8;
        shift = bitPositionController.column2Byte(row);
        while (row < 8) {
            shift >>= 1;
            if ((shift & availableMovesColumn) != 0) {
                result |= shift;
            } else {
                break;
            }
            row++;
        }
        row = item.getCell().getValue() / 8;
        shift = bitPositionController.column2Byte(row);
        while (row > 0) {
            shift <<= 1;
            if ((shift & availableMovesColumn) != 0) {
                result |= shift;
            } else {
                break;
            }
            row--;
        }

        for (row = 0; row < 8; row++) {
            availableMoves.getBoard() [row] = 0;
            shift = bitPositionController.column2Byte(row);
            if ((shift & result) != 0) {
                availableMoves.getBoard() [row] |= columnByte;
            }
        }
    }

    // если пешка атакует
    private boolean checkIfPawnsAttack(final BitPosition position, final Figure item) {
        BitPosition vert = VERT_ALL [item.getCell().getValue() % 8];
        andBitPositions(tempCheckAttackBitPosition, position, vert);
        return isBitPositionEmpty(tempCheckAttackBitPosition);
    }

    private boolean isPositionsEquals(final BitPosition position1, final BitPosition position2) {
        int sum = 0;
        for (int row = 0; row < 8; row++) {
            sum += (position1.getBoard()[row] ^ position2.getBoard()[row]);
        }
        return sum == 0;
    }

    private boolean isEmptyBitPosition(BitPosition position) {
        int sum = 0;
        for (int row = 0; row < 8; row++) {
            sum += position.getBoard()[row];
        }
        return sum == 0;
    }

    private void andBitPositions(BitPosition dst, final BitPosition src1, final BitPosition src2) {
        for (int row = 0; row < 8; row++) {
            dst.getBoard()[row] = (byte)(src1.getBoard()[row] & src2.getBoard()[row]);
        }
    }

    private void orBitPositions(BitPosition dst, final BitPosition src1, final BitPosition src2) {
        for (int row = 0; row < 8; row++) {
            dst.getBoard()[row] = (byte)(src1.getBoard()[row] | src2.getBoard()[row]);
        }
    }

    private void xorBitPositions(BitPosition dst, final BitPosition src1, final BitPosition src2) {
        for (int row = 0; row < 8; row++) {
            dst.getBoard()[row] = (byte)(src1.getBoard()[row] ^ src2.getBoard()[row]);
        }
    }

    private void resetBitPosition(BitPosition position) {
        for (int i = 0; i < 8; i++) {
            position.getBoard()[i] = (byte)0;
        }
    }

    private boolean isBitPositionEmpty (BitPosition position) {
        for (int i = 0; i < 8; i++) {
            if (position.getBoard()[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
