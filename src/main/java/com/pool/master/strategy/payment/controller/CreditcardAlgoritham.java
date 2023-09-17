package com.pool.master.strategy.payment.controller;

public class CreditcardAlgoritham implements Payment {

    private String name;
    private String cardNumber;

    public CreditcardAlgoritham(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount " + amount + " payed using card");
    }

}
