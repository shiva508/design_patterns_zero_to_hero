package com.pool.master.decorator.model;

import com.pool.master.decorator.service.IceCream;
import com.pool.master.decorator.service.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cast() {
        return super.cast();
    }
}
