package com.pool.master.observer.whatsapp.service;

import com.pool.master.observer.whatsapp.model.Message;

public class FriendImpl implements Friend {

    private String contactName;

    public FriendImpl(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println(this.contactName + " " + message.getTextMessage());
    }

}
