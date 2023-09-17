package com.pool.master.factory.simple.model;

public class Hamburger implements Burger {
    public String name;

    public String sauce;

    public String buns;

    @Override
    public void preapare() {
        System.out.println(" Preparing " + this.name);
        System.out.println(" Adding sauce" + this.sauce);
        System.out.println(" Adding buns" + this.buns);
    }

    @Override
    public void cook() {
        System.out.println("Started cooking................");
    }

    @Override
    public void box() {
        System.out.println("Started parceling................");
    }
}
