package chess;

import chess.attacksgen.BlackPawnsAttacks;
import chess.attacksgen.WhitePawnsAttacks;
import chess.movementsgen.BlackPawnsMoves;
import chess.movementsgen.KingMoves;
import chess.movementsgen.KnightMoves;
import chess.movementsgen.WhitePawnsMoves;

import static chess.constants.Constants.EMPTY_BIT_POSITION;

public class Figure {

    private Figures value;

    private Cells cell;

    private Color color;

    public Figure (Figures value, Cells cell, Color color) {
        this.value = value;
        this.cell = cell;
        this.color = color;
    }

    public Figures getValue() {
        return value;
    }

    public void setValue(Figures value) {
        this.value = value;
    }

    public boolean notEmpty() {
        return this.value != Figures.EMPTY;
    }

    public Cells getCell() {
        return cell;
    }

    public void setCell(Cells cell) {
        this.cell = cell;
    }

    public BitPosition getAttack() {
        switch (this.value) {
            case WHITE_KING: case BLACK_KING:
                return KingMoves.valueOf(this.cell.name()).getValue();
            case WHITE_KNIGHT: case BLACK_KNIGHT:
                return KnightMoves.valueOf(this.cell.name()).getValue();
            case WHITE_PAWN:
                return WhitePawnsAttacks.valueOf(this.cell.name()).getValue();
            case BLACK_PAWN:
                return BlackPawnsAttacks.valueOf(this.cell.name()).getValue();
        }
        return EMPTY_BIT_POSITION;
    }

    public BitPosition getMovesOnly() {
        switch (this.value) {
            case WHITE_KING: case BLACK_KING:
                return KingMoves.valueOf(this.cell.name()).getValue();
            case WHITE_KNIGHT: case BLACK_KNIGHT:
                return KnightMoves.valueOf(this.cell.name()).getValue();
            case WHITE_PAWN:
                return WhitePawnsMoves.valueOf(this.cell.name()).getValue();
            case BLACK_PAWN:
                return BlackPawnsMoves.valueOf(this.cell.name()).getValue();
        }
        return EMPTY_BIT_POSITION;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
