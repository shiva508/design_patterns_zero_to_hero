package com.pool.master.observer.controller;

import java.util.Arrays;
import java.util.List;

import com.learn.master.observer.whatsapp.model.Message;
import com.learn.master.observer.whatsapp.service.Friend;
import com.learn.master.observer.whatsapp.service.FriendImpl;
import com.learn.master.observer.whatsapp.service.Nithya;
import com.learn.master.observer.whatsapp.service.Ravi;
import com.learn.master.observer.whatsapp.service.WhatsappService;
import com.learn.master.observer.whatsapp.service.WhatsappServiceImpl;

public class WhatsappClient {
    public static void main(String[] args) {
        Friend nithya = new Nithya();
        Friend ravi = new Ravi();

        WhatsappService whatsappService = new WhatsappServiceImpl();
        whatsappService.addFriend(nithya);
        whatsappService.addFriend(ravi);
        whatsappService.sendMessage(new Message("We will have board meeting"));
        whatsappService.removeFriend(nithya);
        whatsappService.sendMessage(new Message("It is the we upgrade system security"));

        Friend f1 = new FriendImpl("Ravi");
        Friend f2 = new FriendImpl("Nithya");
        Friend f3 = new FriendImpl("Geetha");
        Friend f4 = new FriendImpl("Sai");
        List<Friend> friends = Arrays.asList(f1, f2, f3, f4);
        friends.forEach(fri -> {
            whatsappService.addFriend(fri);
        });
        whatsappService.sendMessage(new Message("We have to leveup everything"));
    }
}
