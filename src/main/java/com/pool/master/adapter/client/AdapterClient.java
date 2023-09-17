package com.pool.master.adapter.client;

import com.learn.master.adapter.classadapter.TSocketAdapterImpl;
import com.learn.master.adapter.model.Volt;
import com.learn.master.adapter.objectadapter.TSocketCompositionAdapterImpl;
import com.learn.master.adapter.service.TSocketAdapter;

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
        switch (voltageType) {
            case 1:
                return adapter.get1Volts();
            case 3:
                return adapter.get3Volts();
            case 12:
                return adapter.get12Volts();
            case 120:
                return adapter.get120Volts();
            default:
                return adapter.get120Volts();
        }
    }
}
