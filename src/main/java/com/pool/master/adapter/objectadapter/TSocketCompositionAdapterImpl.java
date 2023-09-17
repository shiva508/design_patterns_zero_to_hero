package com.pool.master.adapter.objectadapter;

import com.learn.master.adapter.model.TSocket;
import com.learn.master.adapter.model.Volt;
import com.learn.master.adapter.service.TSocketAdapter;

public class TSocketCompositionAdapterImpl implements TSocketAdapter {

    TSocket tSocket = new TSocket();

    @Override
    public Volt get120Volts() {
        return tSocket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(tSocket.getVolt(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convertVolt(tSocket.getVolt(), 40);
    }

    @Override
    public Volt get1Volts() {
        return convertVolt(tSocket.getVolt(), 120);
    }

    private Volt convertVolt(Volt newVolt, int diviser) {
        return new Volt(newVolt.getVolts() / diviser);
    }

}
