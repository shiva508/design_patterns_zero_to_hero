package com.pool.master.decorator.gate.model;

import com.learn.master.decorator.gate.service.GateFeatureSelector;
import com.learn.master.decorator.gate.service.GateMaufacture;

public class NarmalGateFeaturs extends GateFeatureSelector {

    public NarmalGateFeaturs(GateMaufacture gateMaufacture) {
        super(gateMaufacture);
    }

    @Override
    public double manufactureGate(String grade) {
        double basePrice = super.manufactureGate(grade);
        ;
        double manufactureCast = 50.00;
        return (basePrice + manufactureCast);
    }
}
