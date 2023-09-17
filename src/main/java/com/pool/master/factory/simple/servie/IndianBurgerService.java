package com.pool.master.factory.simple.servie;

import com.pool.master.factory.simple.model.Hanburger;
import com.pool.master.factory.simple.model.IndianCheeseBurger;
import com.pool.master.factory.simple.model.IndianNonVegBurger;

public class IndianBurgerService extends BurgerService {

    @Override
    public Hanburger createHanburger(String type) {
        if (type.equals("Cheese")) {
            return new IndianCheeseBurger();
        } else if (type.equals("Nonveg")) {
            return new IndianNonVegBurger();
        } else
            return null;
    }

}
