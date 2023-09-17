package com.pool.master.strategy.model;

import com.learn.master.strategy.controller.ScoreAlgorithamBase;

public class SquareBalloon implements ScoreAlgorithamBase {

    @Override
    public int calculateScore(int taps, int multiplier) {

        return (taps * multiplier) + 40;
    }

}
