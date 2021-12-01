package com.revature.rps;

import static org.junit.Assert.*;
import org.junit.Test;

public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors = new RockPaperScissors();

    @Test
    public void testRockVsPaper() {
        Item player1 = Item.ROCK;
        Item player2 = Item.PAPER;
        assertEquals(1, rockPaperScissors.getWinner(player1, player2));
        player1 = Item.PAPER;
        player2 = Item.ROCK;
        assertEquals(0, rockPaperScissors.getWinner(player1, player2));
    }

    @Test
    public void testTie() {
        Item player1 = Item.ROCK;
        Item player2 = Item.ROCK;
        assertEquals(-1, rockPaperScissors.getWinner(player1, player2));
    }

    @Test
    public void testScissorsVsRock() {
        Item player1 = Item.ROCK;
        Item player2 = Item.SCISSORS;
        assertEquals(0, rockPaperScissors.getWinner(player1, player2));
        player1 = Item.SCISSORS;
        player2 = Item.ROCK;
        assertEquals(1, rockPaperScissors.getWinner(player1, player2));
    }

    @Test
    public void TestScissorsVsPaper() {
        Item player1 = Item.PAPER;
        Item player2 = Item.SCISSORS;
        assertEquals(1, rockPaperScissors.getWinner(player1, player2));
        player1 = Item.SCISSORS;
        player2 = Item.PAPER;
        assertEquals(0, rockPaperScissors.getWinner(player1, player2));
    }

}
