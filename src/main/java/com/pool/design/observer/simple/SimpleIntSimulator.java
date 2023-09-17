package com.pool.design.observer.simple;

public class SimpleIntSimulator {

	public static void main(String[] args) {
		SimpleIntSubject simpleIntSubject=new SimpleIntSubject();
		SimpleIntObserver simpleIntObserver=new SimpleIntObserver(simpleIntSubject);
		simpleIntSubject.setValue(408);
		simpleIntSubject.removeObserver(simpleIntObserver);
		simpleIntSubject.setValue(508);
	}

}
