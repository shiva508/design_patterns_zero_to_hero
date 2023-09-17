package com.pool.master.singleton.model;

public class SingletonLazy {

	private static SingletonLazy singletonLazyInstance;

	private SingletonLazy() {

	}

	public static SingletonLazy getSingletonLazyInstance() {
		if (null == singletonLazyInstance) {
			singletonLazyInstance = new SingletonLazy();
		}
		return singletonLazyInstance;
	}

}
