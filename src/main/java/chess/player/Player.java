package chess.player;

import chess.Cells;
import chess.Color;
import chess.Figures;
import chess.Position;
import chess.controllers.SetUpDefaultBoard;
import chess.minimax.MiniMax;
import javafx.scene.control.Cell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {

    private MiniMax miniMax = new MiniMax();

    private Position position = new Position();

    private SetUpDefaultBoard setUpDefaultBoard = new SetUpDefaultBoard();

    public Player() {
        setUpDefaultBoard.setUp(position);
    }

    public void updatePosition(Position position) {
        for (int i = 0; i < 64; i++) {
            this.position.getBoard()[i] = position.getBoard()[i];
        }
    }

    public void move(Color color) {
        Position p = miniMax.startCalculation(position, color);
        for (int i = 0; i < 64; i++) {
            position.getBoard()[i] = p.getBoard()[i];
        }
    }

    public void printPosition() {
        for (int row = 0; row < 8; row++) {
            System.out.println();
            System.out.print(row + 1);
            for (int col = 0; col < 8; col++) {
                Figures item = position.getBoard()[row * 8 + col];
                if (item == Figures.EMPTY) {
                    System.out.print(" ** ");
                } else if (item == Figures.WHITE_PAWN) {
                    System.out.print(" WP ");
                } else if (item == Figures.WHITE_KING) {
                    System.out.print(" WK ");
                } else if (item == Figures.BLACK_PAWN) {
                    System.out.print(" BP ");
                } else if (item == Figures.BLACK_KING) {
                    System.out.print(" BK ");
                } else if (item == Figures.WHITE_KNIGHT) {
                    System.out.print(" wk ");
                } else if (item == Figures.BLACK_KNIGHT) {
                    System.out.print(" bk ");
                }
            }
        }
        System.out.println();
        System.out.println("  a   b   c   d   e   f   g   h");
    }

    public void updatePositionByMove(String move) {
        String pattern = "([a-h][1-8])([a-h][1-8])";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(move);
        if (m.find()) {
            Cells from = Cells.valueOf(m.group(1).toUpperCase());
            Cells to = Cells.valueOf(m.group(2).toUpperCase());
            Figures item = position.getBoard()[from.getValue()];
            position.getBoard()[from.getValue()] = Figures.EMPTY;
            position.getBoard()[to.getValue()] = item;
        }
    }

//    public static void printPosition(Position pos) {
//        for (int row = 0; row < 8; row++) {
//            System.out.println();
//            System.out.print(row + 1);
//            for (int col = 0; col < 8; col++) {
//                Figures item = pos.getBoard()[row * 8 + col];
//                if (item == Figures.EMPTY) {
//                    System.out.print(" ** ");
//                } else if (item == Figures.WHITE_PAWN) {
//                    System.out.print(" WP ");
//                } else if (item == Figures.WHITE_KING) {
//                    System.out.print(" WK ");
//                } else if (item == Figures.BLACK_PAWN) {
//                    System.out.print(" BP ");
//                } else if (item == Figures.BLACK_KING) {
//                    System.out.print(" BK ");
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("  a   b   c   d   e   f   g   h");
//    }

}
