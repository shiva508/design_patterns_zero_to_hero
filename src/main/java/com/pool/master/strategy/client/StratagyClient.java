package com.pool.master.strategy.client;

import com.pool.master.strategy.controller.ScoreBoard;
import com.pool.master.strategy.model.Balloon;
import com.pool.master.strategy.model.Clown;
import com.pool.master.strategy.model.SquareBalloon;

public class StratagyClient {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("SCORE BOARD BALLON");
        scoreBoard.algorithamBase = new Balloon();
        scoreBoard.showScore(4, 8);
        System.out.println("SCORE BOARD CLOWN");
        scoreBoard.algorithamBase = new Clown();
        scoreBoard.showScore(4, 8);
        System.out.println("SCORE BOARD SQURE");
        scoreBoard.algorithamBase = new SquareBalloon();
        scoreBoard.showScore(4, 8);
    }
}
