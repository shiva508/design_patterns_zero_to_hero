package com.pool.master.factory.simple.servie;

import com.pool.master.factory.simple.model.Hanburger;

public abstract class BurgerService {
    public Hanburger ordeHanburger(String type) {
        Hanburger burger = this.createHanburger(type);
        burger.preapare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Hanburger createHanburger(String type);
}
