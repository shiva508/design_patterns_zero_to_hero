package com.pool.master.decorator.gate.service;

public class BasicGateMaufacture implements GateMaufacture {

    @Override
    public double manufactureGate(String grade) {
        double baseRate = 0;
        switch (grade) {
            case "A":
                baseRate = 150.00;
                break;
            case "B":
                baseRate = 130.00;
                break;
            default:
                baseRate = 120.00;
                break;
        }
        return baseRate;
    }

}
