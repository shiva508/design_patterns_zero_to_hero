package com.pool.design.observer.newsletter;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private List<Observer> observers=null;

	
	public ConcreteSubject() {
		observers=new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public String notifyObserver() {
		return null;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
