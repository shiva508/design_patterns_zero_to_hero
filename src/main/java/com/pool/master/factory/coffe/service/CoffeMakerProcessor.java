package com.pool.master.factory.coffe.service;

import com.pool.master.factory.coffe.model.CoffeMaker;

public abstract class CoffeMakerProcessor {

    public CoffeMaker prepareCoffe(String coffeType) {
        CoffeMaker coffeMaker = this.chooseCoffeMaker(coffeType);
        coffeMaker.start();
        coffeMaker.boilWater();
        coffeMaker.addTeaPowder();
        coffeMaker.addMilk();
        coffeMaker.addSuger();
        coffeMaker.serveCoffe();
        coffeMaker.completed();
        return coffeMaker;

    }

    public abstract CoffeMaker chooseCoffeMaker(String coffeType);
}
