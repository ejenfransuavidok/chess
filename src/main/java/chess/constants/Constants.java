package chess.constants;

import chess.BitPosition;

public class Constants {

    public static BitPosition EMPTY_BIT_POSITION = new BitPosition(new byte [8]);

    public static BitPosition VERT_A = new BitPosition(new byte [8]);

    public static BitPosition VERT_B = new BitPosition(new byte [8]);

    public static BitPosition VERT_C = new BitPosition(new byte [8]);

    public static BitPosition VERT_D = new BitPosition(new byte [8]);

    public static BitPosition VERT_E = new BitPosition(new byte [8]);

    public static BitPosition VERT_F = new BitPosition(new byte [8]);

    public static BitPosition VERT_G = new BitPosition(new byte [8]);

    public static BitPosition VERT_H = new BitPosition(new byte [8]);

    public static BitPosition [] VERT_ALL = new BitPosition [8];

    static {
        for (int row = 0; row < 8; row++) {
            VERT_A.getBoard() [row] = (byte)0b10000000;
            VERT_B.getBoard() [row] = (byte)0b01000000;
            VERT_C.getBoard() [row] = (byte)0b00100000;
            VERT_D.getBoard() [row] = (byte)0b00010000;
            VERT_E.getBoard() [row] = (byte)0b00001000;
            VERT_F.getBoard() [row] = (byte)0b00000100;
            VERT_G.getBoard() [row] = (byte)0b00000010;
            VERT_H.getBoard() [row] = (byte)0b00000001;
        }
        VERT_ALL [0] = VERT_A;
        VERT_ALL [1] = VERT_B;
        VERT_ALL [2] = VERT_C;
        VERT_ALL [3] = VERT_D;
        VERT_ALL [4] = VERT_E;
        VERT_ALL [5] = VERT_F;
        VERT_ALL [6] = VERT_G;
        VERT_ALL [7] = VERT_H;
    }

}
