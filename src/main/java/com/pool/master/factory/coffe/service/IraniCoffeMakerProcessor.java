package com.pool.master.factory.coffe.service;

import com.pool.master.factory.coffe.model.CoffeMaker;
import com.pool.master.factory.coffe.model.IraniCoffeMaker;
import com.pool.master.factory.coffe.model.LightIraniCoffeMaker;
import com.pool.master.factory.coffe.model.StrongIraniCoffeMaker;

public class IraniCoffeMakerProcessor extends CoffeMakerProcessor {

    @Override
    public CoffeMaker chooseCoffeMaker(String coffeType) {

        if (coffeType.equals("N")) {
            return new IraniCoffeMaker();
        } else if (coffeType.equals("S")) {
            return new StrongIraniCoffeMaker();
        } else if (coffeType.equals("L")) {
            return new LightIraniCoffeMaker();
        } else
            return null;
    }

}
