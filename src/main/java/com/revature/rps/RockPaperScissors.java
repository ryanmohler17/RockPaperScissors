package com.revature.rps;

public class RockPaperScissors {

    public int getWinner(Item player1, Item player2) {
        if (player1.equals(player2)) {
            return -1;
        }
        if (player1.equals(Item.values()[0]) && player2.equals(Item.values()[Item.values().length - 1])) {
            return 0;
        }
        if (player2.equals(Item.values()[0]) && player1.equals(Item.values()[Item.values().length - 1])) {
            return 1;
        }
        return player1.ordinal() > player2.ordinal() ? 0 : 1;
    }

}
