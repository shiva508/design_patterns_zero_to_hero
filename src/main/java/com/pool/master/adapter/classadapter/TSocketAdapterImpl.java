package com.pool.master.adapter.classadapter;

import com.pool.master.adapter.model.TSocket;
import com.pool.master.adapter.model.Volt;
import com.pool.master.adapter.service.TSocketAdapter;

public class TSocketAdapterImpl extends TSocket implements TSocketAdapter {

    @Override
    public Volt get120Volts() {
        Volt volt = getVolt();
        return volt;
    }

    @Override
    public Volt get12Volts() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

    @Override
    public Volt get1Volts() {
        Volt volt = getVolt();
        return convertVolt(volt, 120);
    }

    private Volt convertVolt(Volt newVolt, int diviser) {
        return new Volt(newVolt.getVolts() / diviser);
    }
}
