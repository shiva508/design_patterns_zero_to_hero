package com.pool.master.adapter.client;

import com.pool.master.adapter.classadapter.TSocketAdapterImpl;
import com.pool.master.adapter.model.Volt;
import com.pool.master.adapter.objectadapter.TSocketCompositionAdapterImpl;
import com.pool.master.adapter.service.TSocketAdapter;

public class AdapterClient {
    public static void main(String[] args) {
        classAdapterTest();
        compositionAdapterTest();
    }

    public static void classAdapterTest() {
        TSocketAdapter socketAdapter = new TSocketAdapterImpl();
        Volt voltOne = switchVolt(socketAdapter, 1);
        Volt volThree = switchVolt(socketAdapter, 3);
        Volt volTwelve = switchVolt(socketAdapter, 12);
        Volt volOneTwelve = switchVolt(socketAdapter, 120);
        System.out.println(voltOne.getVolts());
        System.out.println(volThree.getVolts());
        System.out.println(volTwelve.getVolts());
        System.out.println(volOneTwelve.getVolts());
    }

    public static void compositionAdapterTest() {
        TSocketAdapter socketAdapter = new TSocketCompositionAdapterImpl();
        Volt voltOne = switchVolt(socketAdapter, 1);
        Volt volThree = switchVolt(socketAdapter, 3);
        Volt volTwelve = switchVolt(socketAdapter, 12);
        Volt volOneTwelve = switchVolt(socketAdapter, 120);
        System.out.println(voltOne.getVolts());
        System.out.println(volThree.getVolts());
        System.out.println(volTwelve.getVolts());
        System.out.println(volOneTwelve.getVolts());
    }

    public static Volt switchVolt(TSocketAdapter adapter, int voltageType) {
        return switch (voltageType) {
            case 1 -> adapter.get1Volts();
            case 3 -> adapter.get3Volts();
            case 12 -> adapter.get12Volts();
            case 120 -> adapter.get120Volts();
            default -> adapter.get120Volts();
        };
    }
}
