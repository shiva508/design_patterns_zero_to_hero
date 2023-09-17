package com.pool.master.strategy.bankcard.controller;

public interface RateHandler {
    public abstract double interestRatePicker(Double loadAmount);

    /*
     * public double interestRateHandler(String bankName, Double loadAmount) {
     * double interestRate = 0;
     * switch (bankName) {
     * case "Axis":
     * if (0 < loadAmount && loadAmount < 1000) {
     * interestRate = 2.0;
     * } else {
     * interestRate = 3.0;
     * }
     * break;
     * case "Sbi":
     * if (0 < loadAmount && loadAmount < 1000) {
     * interestRate = 1.0;
     * } else {
     * interestRate = 1.50;
     * }
     * break;
     * case "Hdfc":
     * if (0 < loadAmount && loadAmount < 1000) {
     * interestRate = 1.50;
     * } else {
     * interestRate = 2.50;
     * }
     * break;
     * default:
     * break;
     * }
     * return interestRate;
     * }
     */

}
