package com.pool.master.strategy.controller;

public class ScoreBoard {

    public ScoreAlgorithamBase algorithamBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(algorithamBase.calculateScore(taps, multiplier));
    }
}
