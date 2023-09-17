package com.pool.master.strategy.bankcard.client;

import com.pool.master.strategy.bankcard.controller.BankcardProcessor;
import com.pool.master.strategy.bankcard.model.AxisBankcard;

public class BankcardClient {
    public static void main(String[] args) {
        BankcardProcessor processor = new BankcardProcessor();
        processor.bankcard = new AxisBankcard();
    }
}
