package com.learn.design.creational.singleton;

public class SingletonEagar {
	
	private static SingletonEagar singletonInstance = new SingletonEagar();

	private SingletonEagar() {

	}

	public static SingletonEagar getSingletonInstance() {
		return singletonInstance;
	}

}
