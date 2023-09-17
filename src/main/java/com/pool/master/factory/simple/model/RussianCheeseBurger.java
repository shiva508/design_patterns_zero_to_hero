package com.pool.master.factory.simple.model;

public class RussianCheeseBurger extends Hanburger {

    public RussianCheeseBurger() {
        name = "Russian Cheese Burger";
        sauce = "Spicy Natu chicken sauce";
        buns = "Handmade Bun";
    }

    @Override
    public void cook() {
        System.out.println("Cooking russian...............");
    }
}
