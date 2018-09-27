package chess.minimax;

import chess.Color;
import chess.Figures;
import chess.Position;
import chess.movementsgen.MovesGen;

public class MiniMax {

    private static final int SIZE_BANK = 5_000_000;

    private static Position bank [] = new Position [SIZE_BANK];

    private static int fromBankPointer = 0;

    private static double PAWN_PRICE = 1d;

    private static double KNIGHT_PRICE = 3d;

    private static Color OPPONENT = Color.WHITE;

    private static double [] WHITE_PAWN_POSITION_SCORE = {
            0.08d, 0.08d, 0.08d,   0.08d,  0.08d, 0.08d, 0.08d, 0.08d,
            0.07d, 0.07d, 0.07d,   0.07d,  0.07d, 0.07d, 0.07d, 0.07d,
            0.06d, 0.06d, 0.06d,   0.06d,  0.06d, 0.06d, 0.06d, 0.06d,
            0.05d, 0.05d, 0.055d, 0.055d, 0.055d, 0.05d, 0.05d, 0.05d,
            0.04d, 0.04d, 0.045d, 0.045d, 0.045d, 0.04d, 0.04d, 0.04d,
            0.03d, 0.03d, 0.035d, 0.035d, 0.035d, 0.03d, 0.03d, 0.03d,
            0.02d, 0.02d, 0.02d,   0.02d,  0.02d, 0.02d, 0.02d, 0.02d,
            0.01d, 0.01d, 0.01d,   0.01d,  0.01d, 0.01d, 0.01d, 0.01d
    };

    private static double [] BLACK_PAWN_POSITION_SCORE = {
            -0.08d, -0.08d, -0.08d,   -0.08d,  -0.08d, -0.08d, -0.08d, -0.08d,
            -0.07d, -0.07d, -0.07d,   -0.07d,  -0.07d, -0.07d, -0.07d, -0.07d,
            -0.06d, -0.06d, -0.06d,   -0.06d,  -0.06d, -0.06d, -0.06d, -0.06d,
            -0.05d, -0.05d, -0.055d, -0.055d, -0.055d, -0.05d, -0.05d, -0.05d,
            -0.04d, -0.04d, -0.045d, -0.045d, -0.045d, -0.04d, -0.04d, -0.04d,
            -0.03d, -0.03d, -0.035d, -0.035d, -0.035d, -0.03d, -0.03d, -0.03d,
            -0.02d, -0.02d, -0.02d,   -0.02d,  -0.02d, -0.02d, -0.02d, -0.02d,
            -0.01d, -0.01d, -0.01d,   -0.01d,  -0.01d, -0.01d, -0.01d, -0.01d
    };

    private static double [] WHITE_KNIGHT_POSITION_SCORE = {
            0.01d, 0.01d, 0.01d,   0.01d,  0.01d, 0.01d, 0.01d, 0.01d,
            0.01d, 0.02d, 0.02d,   0.02d,  0.02d, 0.02d, 0.02d, 0.01d,
            0.01d, 0.02d, 0.03d,   0.03d,  0.03d, 0.03d, 0.02d, 0.01d,
            0.01d, 0.02d, 0.03d,   0.04d,  0.04d, 0.03d, 0.02d, 0.01d,
            0.01d, 0.02d, 0.03d,   0.04d,  0.04d, 0.03d, 0.02d, 0.01d,
            0.01d, 0.02d, 0.03d,   0.03d,  0.03d, 0.03d, 0.02d, 0.01d,
            0.01d, 0.02d, 0.02d,   0.02d,  0.02d, 0.02d, 0.02d, 0.01d,
            0.01d, 0.01d, 0.01d,   0.01d,  0.01d, 0.01d, 0.01d, 0.01d
    };

    private static double [] BLACK_KNIGHT_POSITION_SCORE = {
            -0.01d, -0.01d, -0.01d,   -0.01d,  -0.01d, -0.01d, -0.01d, -0.01d,
            -0.01d, -0.02d, -0.02d,   -0.02d,  -0.02d, -0.02d, -0.02d, -0.01d,
            -0.01d, -0.02d, -0.03d,   -0.03d,  -0.03d, -0.03d, -0.02d, -0.01d,
            -0.01d, -0.02d, -0.03d,   -0.04d,  -0.04d, -0.03d, -0.02d, -0.01d,
            -0.01d, -0.02d, -0.03d,   -0.04d,  -0.04d, -0.03d, -0.02d, -0.01d,
            -0.01d, -0.02d, -0.03d,   -0.03d,  -0.03d, -0.03d, -0.02d, -0.01d,
            -0.01d, -0.02d, -0.02d,   -0.02d,  -0.02d, -0.02d, -0.02d, -0.01d,
            -0.01d, -0.01d, -0.01d,   -0.01d,  -0.01d, -0.01d, -0.01d, -0.01d
    };

    static {
        for (int i = 0; i < SIZE_BANK; i++) {
            bank [i] = new Position();
        }
    }

    MovesGen movesGen = new MovesGen();

    public MiniMax() {

    }

    public Position startCalculation(final Position position, final Color color) {
        System.out.println("fromBankPointer = " + fromBankPointer);
        fromBankPointer = 0;
        return calculate(position, 0, bank, color, 5);
    }

    public Position calculate(final Position position, int fromBank, Position [] bank, final Color color, int deep) {
        if (fromBank + 100 < SIZE_BANK && deep > 0) {

//            System.out.println("<<<<<<<<<<" + not(color).name() + ">>>>>>>>>>");
//            Player.printPosition(position);
//            System.out.println("<<<<<<<<<<>>>>>>>>>>");

            int totalMoves = movesGen.generate(position, fromBank, SIZE_BANK, bank, color);

//            for (int k = fromBank; k < fromBank + totalMoves; k++) {
//                Player.printPosition(bank [k]);
//            }
            fromBankPointer += totalMoves;

            double score = getMinimumScore(color);

            Position result = null;

            // проверка на мат
            if (totalMoves == 0) {
                if (movesGen.checkShah(position, color)) {
                    // это мат
                    result = position;
                    result.setScore(getMinimumScore(color));
                    return result;
                }
            }
            for (int i = fromBank; i < fromBank + totalMoves; i++) {
                // пробежать по всем ходам и вернуть максимум
                Position p = bank [i];
                // повышаем значимость результата противника
                int k = not(color) == OPPONENT ? 10 : 1;
                Double s = k * calcPosition (p, color);
                Position calcPosition = calculate(p, fromBankPointer, bank, not(color), deep - 1);
                s += calcPosition != null ? calcPosition.getScore() : 0;
                p.setScore(s);
                if (color == Color.WHITE) {
                    if (p.getScore() > score) {
                        score = p.getScore();
                        result = p;
                    }
                } else {
                    if (p.getScore() < score) {
                        score = p.getScore();
                        result = p;
                    }
                }
            }
            return result;
        }
        return null;
    }

    public Double calcPosition(Position position, Color color) {
        double score = 0;
        for (int i = 0; i < 64; i++) {
            Figures item = position.getBoard()[i];
            if (color == Color.WHITE) {
                switch (item) {
                    case WHITE_PAWN:
                        score += PAWN_PRICE;
                        score += WHITE_PAWN_POSITION_SCORE [i];
                        break;
                    case WHITE_KNIGHT:
                        score += KNIGHT_PRICE;
                        score += WHITE_KNIGHT_POSITION_SCORE [i];
                        break;
                }
            } else {
                switch (item) {
                    case BLACK_PAWN:
                        score -= PAWN_PRICE;
                        score += BLACK_PAWN_POSITION_SCORE [i];
                        break;
                    case BLACK_KNIGHT:
                        score -= KNIGHT_PRICE;
                        score += BLACK_KNIGHT_POSITION_SCORE [i];
                        break;
                }
            }
        }
        return score;
    }

    private double getMaximumScore(Color color) {
        return color == Color.WHITE ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    private double getMinimumScore(Color color) {
        return color == Color.WHITE ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }

    private Color not (Color inp) {
        return inp == Color.BLACK ? Color.WHITE : Color.BLACK;
    }

}
