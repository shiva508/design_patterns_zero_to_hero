package com.pool.master.strategy.bankcard.controller;

public class BankcardProcessor {
    public Bankcard bankcard;

    public RateHandler handler;

    public void processCard(String bankName, double interestRate) {

        System.out.println("Interest rate for " + bankName + ":" + bankcard.calculateInterest(bankName, interestRate));
    }
}
