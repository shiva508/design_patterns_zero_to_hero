package com.pool.master.decorator.gate.service;

public class GateFeatureSelector implements GateMaufacture {

    private GateMaufacture gateMaufacture;

    public GateFeatureSelector(GateMaufacture gateMaufacture) {
        this.gateMaufacture = gateMaufacture;
    }

    @Override
    public double manufactureGate(String grade) {
        return gateMaufacture.manufactureGate(grade);
    }

}
