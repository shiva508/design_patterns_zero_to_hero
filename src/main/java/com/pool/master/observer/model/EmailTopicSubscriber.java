package com.pool.master.observer.model;

import com.pool.master.observer.interfaces.Observer;
import com.pool.master.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " No message found");
        } else {
            System.out.println(name + " Retriving message " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }

}
