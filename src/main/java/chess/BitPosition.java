package chess;

public class BitPosition {

    private byte [] board;

    public BitPosition(byte [] board) {
        this.board = board;
    }

    public void copy(BitPosition position) {
        for (int i = 0; i < 8; i++) {
            this.board [i] = position.getBoard() [i];
        }
    }

    public byte [] getBoard () {
        return board;
    }

}
