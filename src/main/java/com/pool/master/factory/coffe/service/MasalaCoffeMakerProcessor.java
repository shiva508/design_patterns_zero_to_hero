package com.pool.master.factory.coffe.service;

import com.pool.master.factory.coffe.model.CoffeMaker;
import com.pool.master.factory.coffe.model.LightMasalaCoffeMaker;
import com.pool.master.factory.coffe.model.MasalaCoffeMaker;
import com.pool.master.factory.coffe.model.StrongMasalaCoffeMaker;

public class MasalaCoffeMakerProcessor extends CoffeMakerProcessor {

    @Override
    public CoffeMaker chooseCoffeMaker(String coffeType) {
        if (coffeType.equals("N")) {
            return new MasalaCoffeMaker();
        } else if (coffeType.equals("S")) {
            return new StrongMasalaCoffeMaker();
        } else if (coffeType.equals("L")) {
            return new LightMasalaCoffeMaker();
        } else
            return null;
    }

}
