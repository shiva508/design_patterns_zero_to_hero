package com.pool.master.strategy.bankcard.controller;

public interface Bankcard {
    public abstract double calculateInterest(String bankName, double interestRate);
}
