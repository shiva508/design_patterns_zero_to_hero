package com.pool.master.factory.simple.factory;

import com.learn.master.factory.simple.model.Burger;
import com.learn.master.factory.simple.model.CheeseBurger;
import com.learn.master.factory.simple.model.GreekBurger;
import com.learn.master.factory.simple.model.Hamburger;
import com.learn.master.factory.simple.model.MeatBurger;

public class SimpleHamburgerFactory {
    public Burger createHamburger(String type) {
        Burger burger = null;
        if (type.equals("Ham")) {
            burger = new Hamburger();
        } else if (type.equals("Chees")) {
            burger = new CheeseBurger();
        } else if (type.equals("Greek")) {
            burger = new GreekBurger();
        } else if (type.equals("Meet")) {
            burger = new MeatBurger();
        }
        return burger;
    }
}
