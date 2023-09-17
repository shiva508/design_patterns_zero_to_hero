package com.pool.master.strategy.bankcard.model;

import com.pool.master.strategy.bankcard.controller.Bankcard;

public class HdfcBankcard implements Bankcard {

    @Override
    public double calculateInterest(String bankName, double loadAmount) {
        double interestRate = 0;
        return interestRate;
    }

}
