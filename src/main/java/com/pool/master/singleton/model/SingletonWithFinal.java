package com.pool.master.singleton.model;

public class SingletonWithFinal {
	private static final SingletonWithFinal SINGLETON_WITH_FINAL = new SingletonWithFinal();

	private SingletonWithFinal() {

	}

	public static SingletonWithFinal getSingletonWithFinal() {
		return SINGLETON_WITH_FINAL;
	}

}
