package com.pool.master.factory.simple.servie;

import com.learn.master.factory.simple.factory.SimpleHamburgerFactory;
import com.learn.master.factory.simple.model.Burger;
import com.learn.master.factory.simple.model.Hamburger;

public abstract class HamburgerService {

    private SimpleHamburgerFactory factory;

    public HamburgerService(SimpleHamburgerFactory factory) {
        this.factory = factory;
    }

    public Burger ordeHanburger() {
        Burger hanburger = new Hamburger();
        hanburger.preapare();
        hanburger.cook();
        hanburger.box();
        return hanburger;
    }

    public Burger ordeHanburger(String type) {
        Burger burger = factory.createHamburger(type);
        burger.preapare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Burger createHanburger(String type);
}
