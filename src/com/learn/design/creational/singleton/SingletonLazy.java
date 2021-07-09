package com.learn.design.creational.singleton;

public class SingletonLazy {

	private static SingletonLazy singletonLazyInstance;

	private SingletonLazy() {

	}

	public static SingletonLazy getSingletonLazyInstance() {
		if(null ==singletonLazyInstance) {
			singletonLazyInstance=new SingletonLazy();
		}
		return singletonLazyInstance;
	}	
	
}
