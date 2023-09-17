package com.pool.design.observer.newsletter;

import java.util.List;

public interface Subject {
	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public String notifyObserver();
}
