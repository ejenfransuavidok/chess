package chess;

public enum Figures {

    EMPTY((byte)0),
    WHITE_PAWN((byte)1),
    WHITE_KING((byte)2),
    WHITE_KNIGHT((byte)3),
    BLACK_PAWN((byte)4),
    BLACK_KING((byte)5),
    BLACK_KNIGHT((byte)6);

    private byte value;

    private Figures (byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

}