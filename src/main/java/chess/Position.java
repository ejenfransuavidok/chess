package chess;

public class Position {

    private Double score = 0.0;

    private Figures [] board = new Figures [64];

    public Figures [] getBoard () {
        return board;
    }

    public void copy (Position position) {
        for (int i = 0; i < 64; i++) {
            this.getBoard() [i] = position.getBoard() [i];
        }
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
