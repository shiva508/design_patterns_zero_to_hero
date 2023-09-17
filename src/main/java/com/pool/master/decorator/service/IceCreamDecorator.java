package com.pool.master.decorator.service;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cast() {
        return this.iceCream.cast();
    }

}
