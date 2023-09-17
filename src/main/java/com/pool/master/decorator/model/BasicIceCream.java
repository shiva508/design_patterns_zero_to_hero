package com.pool.master.decorator.model;

import com.learn.master.decorator.service.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("BASIC ICE CREAM");
    }

    @Override
    public double cast() {
        return 0.50;
    }

}
