package com.pool.master.command.model;

public class KarbiCharacterReceiver {
    private String name;

    public void moveUp() {
        System.out.println(getName() + " jumpping up!");
    }

    public void moveDown() {
        System.out.println(getName() + " jumpping down!");
    }

    public void moveLeft() {
        System.out.println(getName() + " jumpping left!");
    }

    public void moveRight() {
        System.out.println(getName() + " jumpping right!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
