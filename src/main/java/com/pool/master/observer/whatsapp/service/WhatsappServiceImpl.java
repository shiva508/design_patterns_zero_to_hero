package com.pool.master.observer.whatsapp.service;

import java.util.ArrayList;
import java.util.List;

import com.learn.master.observer.whatsapp.model.Message;

public class WhatsappServiceImpl implements WhatsappService {

    private List<Friend> friends;

    public WhatsappServiceImpl() {
        friends = new ArrayList<>();
    }

    @Override
    public void addFriend(Friend friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
        }
    }

    @Override
    public void removeFriend(Friend friend) {
        friends.remove(friend);

    }

    @Override
    public void sendMessage(Message message) {
        friends.forEach(fri -> {
            fri.sendMessage(message);
        });
    }

}
