package mainpack;

import chess.Color;
import chess.player.Player;

import java.util.Scanner;

public class ChessMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player();

        player.printPosition();

        while (true) {
            System.out.print("Enter your move: ");
            String move = scanner.nextLine();
            player.updatePositionByMove(move);
            player.printPosition();
            System.out.println("waiting...");
            player.move(Color.BLACK);
            player.printPosition();
        }

    }

}