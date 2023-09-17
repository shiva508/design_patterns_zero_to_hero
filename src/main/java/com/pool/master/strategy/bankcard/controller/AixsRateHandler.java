package com.pool.master.strategy.bankcard.controller;

public class AixsRateHandler implements RateHandler {

    @Override
    public double interestRatePicker(Double loadAmount) {
        double interestRate = 0;
        if (0 < loadAmount && loadAmount < 1000) {
            interestRate = 2.0;
        } else {
            interestRate = 3.0;
        }
        return interestRate;
    }

}
