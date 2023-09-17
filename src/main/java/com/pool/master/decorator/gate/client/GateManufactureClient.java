package com.pool.master.decorator.gate.client;

import com.learn.master.decorator.gate.model.NarmalGateFeaturs;
import com.learn.master.decorator.gate.service.BasicGateMaufacture;
import com.learn.master.decorator.gate.service.GateMaufacture;

public class GateManufactureClient {
    public static void main(String[] args) {
        GateMaufacture gateMaufacture = new BasicGateMaufacture();
        double basicGateManufacturePrice = gateMaufacture.manufactureGate("A");
        System.out.println(basicGateManufacturePrice);

        GateMaufacture narmalGateMaufacture = new NarmalGateFeaturs(gateMaufacture);
        double narmalGateManufacturePrice = narmalGateMaufacture.manufactureGate("A");
        System.out.println(narmalGateManufacturePrice);
    }
}
