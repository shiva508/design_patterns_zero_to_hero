package com.pool.design.observer.simple;


public class SimpleIntObserver implements ObserverInterface {	
	
	private int value;
	private SubjectInterface subjectInterface;
	
	
	
	public SimpleIntObserver(SubjectInterface subjectInterface) {
		this.subjectInterface = subjectInterface;
		subjectInterface.registerObserver(this);
	}



	@Override
	public void update(int value) {
		this.value=value;
		display();
	}

	public void display() {
		System.out.println("Value: " + value);
	}
	
	

}
