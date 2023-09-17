package com.pool.design.observer.simple;

public interface SubjectInterface {
	
	public void registerObserver(ObserverInterface observerInterface);

	public void removeObserver(ObserverInterface observerInterface);

	public void notifyObservers();
}
