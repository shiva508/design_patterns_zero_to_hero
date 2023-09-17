package com.pool.master.decorator.model;

import com.pool.master.decorator.service.IceCream;
import com.pool.master.decorator.service.IceCreamDecorator;

public class VanilaIceCream extends IceCreamDecorator {

    public VanilaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cast() {

        return 0.8 + super.cast();
    }
}
