package chess.controllers;

import chess.BitPosition;
import chess.Color;
import chess.Position;

public class BitPositionController {

    public void position2BitPosition(Position position, BitPosition bitPosition, Color color) {
        int index;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                index = row * 8 + col;
                switch (color) {
                    case WHITE:
                    {
                        switch (position.getBoard()[index]) {
                            case WHITE_PAWN: case WHITE_KNIGHT: case WHITE_KING:
                                bitPosition.getBoard()[row] |= column2Byte(col);
                                break;
                            default:
                                bitPosition.getBoard()[row] &= (~column2Byte(col));
                        }
                        break;
                    }
                    case BLACK:
                    {
                        switch (position.getBoard()[index]) {
                            case BLACK_PAWN: case BLACK_KNIGHT: case BLACK_KING:
                                bitPosition.getBoard()[row] |= column2Byte(col);
                                break;
                            default:
                                bitPosition.getBoard()[row] &= (~column2Byte(col));
                        }
                        break;
                    }
                }
            }
        }
    }

    public byte column2Byte (int column) {
        switch (column) {
            case 0:
                return (byte)0b10000000;
            case 1:
                return (byte)0b01000000;
            case 2:
                return (byte)0b00100000;
            case 3:
                return (byte)0b00010000;
            case 4:
                return (byte)0b00001000;
            case 5:
                return (byte)0b00000100;
            case 6:
                return (byte)0b00000010;
            case 7:
                return (byte)0b00000001;
        }
        return 0;
    }

}
