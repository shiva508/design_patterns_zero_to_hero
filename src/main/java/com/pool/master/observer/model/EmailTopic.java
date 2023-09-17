package com.pool.master.observer.model;

import java.util.ArrayList;
import java.util.List;

import com.learn.master.observer.interfaces.Observer;
import com.learn.master.observer.interfaces.Subject;

public class EmailTopic implements Subject {

    private List<Observer> observers;

    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("No Observers are available");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }

    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        observers.forEach(obs -> obs.update());
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to my topic :" + message);
        this.message = message;
        this.notifyObserver();
    }
}
