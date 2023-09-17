package com.pool.master.observer.whatsapp.service;

import com.learn.master.observer.whatsapp.model.Message;

public class Ravi implements Friend {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Ravi  " + message.getTextMessage());
    }

}
