package com.pool.master.strategy.bankcard.client;

import com.learn.master.strategy.bankcard.controller.BankcardProcessor;
import com.learn.master.strategy.bankcard.model.AxisBankcard;

public class BankcardClient {
    public static void main(String[] args) {
        BankcardProcessor processor = new BankcardProcessor();
        processor.bankcard = new AxisBankcard();
    }
}
