package com.pool.design.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleIntSubject implements SubjectInterface {

	private List<ObserverInterface> observers;
	private int value = 0;

	public SimpleIntSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(ObserverInterface observerInterface) {
		observers.add(observerInterface);
	}

	@Override
	public void removeObserver(ObserverInterface observerInterface) {
		observers.add(observerInterface);
	}

	@Override
	public void notifyObservers() {
		for (ObserverInterface observerInterface : observers) {
			observerInterface.update(value);
		}
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}

}
