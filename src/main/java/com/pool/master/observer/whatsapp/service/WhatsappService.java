package com.pool.master.observer.whatsapp.service;

import com.learn.master.observer.whatsapp.model.Message;

public interface WhatsappService {
    public void addFriend(Friend friendService);

    public void removeFriend(Friend friendService);

    public void sendMessage(Message message);
}
