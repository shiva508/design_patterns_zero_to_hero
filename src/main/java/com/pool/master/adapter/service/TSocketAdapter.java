package com.pool.master.adapter.service;

import com.pool.master.adapter.model.Volt;

public interface TSocketAdapter {
    public Volt get120Volts();

    public Volt get12Volts();

    public Volt get3Volts();

    public Volt get1Volts();
}
