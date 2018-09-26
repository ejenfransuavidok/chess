package chess.controllers;

import chess.Cells;
import chess.Figures;
import chess.Position;

public class SetUpDefaultBoard {

    public void setUp (Position position) {
        Figures [] board = position.getBoard();
        for (int i = 0; i < 64; i++) {
            board [i] = Figures.EMPTY;
        }
        board [Cells.A2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.B2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.C2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.D2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.E2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.F2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.G2.getValue()] = Figures.WHITE_PAWN;
        board [Cells.H2.getValue()] = Figures.WHITE_PAWN;

        board [Cells.B1.getValue()] = Figures.WHITE_KNIGHT;
        board [Cells.G1.getValue()] = Figures.WHITE_KNIGHT;
        board [Cells.E1.getValue()] = Figures.WHITE_KING;

        board [Cells.A7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.B7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.C7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.D7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.E7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.F7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.G7.getValue()] = Figures.BLACK_PAWN;
        board [Cells.H7.getValue()] = Figures.BLACK_PAWN;

        board [Cells.B8.getValue()] = Figures.BLACK_KNIGHT;
        board [Cells.G8.getValue()] = Figures.BLACK_KNIGHT;
        board [Cells.E8.getValue()] = Figures.BLACK_KING;
    }

}
