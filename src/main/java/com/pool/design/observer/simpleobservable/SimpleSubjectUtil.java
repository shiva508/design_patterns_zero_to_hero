package com.pool.design.observer.simpleobservable;

import java.util.Observable;

public class SimpleSubjectUtil extends Observable {
	private int value = 0;

	public SimpleSubjectUtil() {

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		setChanged();
		notifyObservers(this);
	}

}
