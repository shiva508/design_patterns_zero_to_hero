package com.pool.master.factory.simple.servie;

import com.pool.master.factory.simple.model.Hanburger;
import com.pool.master.factory.simple.model.RussianCheeseBurger;
import com.pool.master.factory.simple.model.RussianNonVegBurger;

public class RussianBurgerService extends BurgerService {

    @Override
    public Hanburger createHanburger(String type) {
        if (type.equals("Cheese")) {
            return new RussianCheeseBurger();
        } else if (type.equals("Nonveg")) {
            return new RussianNonVegBurger();
        } else
            return null;
    }

}
