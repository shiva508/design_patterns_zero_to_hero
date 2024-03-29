package com.pool.master.decorator.model;

import com.pool.master.decorator.service.IceCream;
import com.pool.master.decorator.service.IceCreamDecorator;

public class ChacolateIceCream extends IceCreamDecorator {

    public ChacolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cast() {

        return 0.5 + super.cast();
    }
}
