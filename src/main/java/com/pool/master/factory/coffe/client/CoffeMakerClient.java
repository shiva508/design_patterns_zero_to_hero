package com.pool.master.factory.coffe.client;

import com.learn.master.factory.coffe.service.CoffeMakerProcessor;
import com.learn.master.factory.coffe.service.IraniCoffeMakerProcessor;
import com.learn.master.factory.coffe.service.MasalaCoffeMakerProcessor;

public class CoffeMakerClient {
    public static void main(String[] args) {
        CoffeMakerProcessor iraniaonCoffeMakerProcessor = new IraniCoffeMakerProcessor();
        iraniaonCoffeMakerProcessor.prepareCoffe("N");

        CoffeMakerProcessor masalaCoffeMakerProcessor = new MasalaCoffeMakerProcessor();
        masalaCoffeMakerProcessor.chooseCoffeMaker("S");
    }
}
