package com.pool.master.strategy.payment.controller;

public class PaypalAlgoritham implements Payment {

    private String email;
    private String password;

    public PaypalAlgoritham(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount " + amount + " paid using paypal");
    }

}
