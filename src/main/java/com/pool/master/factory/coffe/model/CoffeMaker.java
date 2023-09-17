package com.pool.master.factory.coffe.model;

public class CoffeMaker {

    public String coffeName;

    public String milk;

    public String teaPowder;

    public String suger;

    public void start() {
        System.out.println("Started making " + this.coffeName);
    }

    public void boilWater() {
        System.out.println("Started boiling water................");
    }

    public void addTeaPowder() {
        System.out.println("Adding " + this.teaPowder + " Tea powder to boiling water ");
    }

    public void addMilk() {
        System.out.println("Adding " + this.milk + " milk to mixture");
    }

    public void addSuger() {
        System.out.println("Adding " + this.milk + " spoons of suger to mixture");
    }

    public void serveCoffe() {
        System.out.println("Everything is setup ready to serve................");
    }

    public void completed() {
        System.out.println(this.coffeName + " preparation completed");
    }
}
