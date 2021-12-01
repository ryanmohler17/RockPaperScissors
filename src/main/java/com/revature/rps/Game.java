package com.revature.rps;

import java.util.Locale;
import java.util.Scanner;

public class Game {

    public static void main(String... args) {
        new Game().init();
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Item player1;
        while (true) {
            System.out.print("Player 1 choice: ");
            String in = scanner.nextLine().trim();
            try {
                player1 = Item.valueOf(in.toUpperCase(Locale.ROOT));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Enter rock paper or scissors");
            }
        }
        Item player2;
        while (true) {
            System.out.print("Player 2 choice: ");
            String in = scanner.nextLine().trim();
            try {
                player2 = Item.valueOf(in.toUpperCase(Locale.ROOT));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Enter rock paper or scissors");
            }
        }

        int win = rockPaperScissors.getWinner(player1, player2);
        if (win == -1) {
            System.out.println("TIE");
        } else if (win == 0) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }

}
