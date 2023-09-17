package com.pool.master.singleton.model;

public class SingletonTester {

	public static void main(String[] args) {
		System.out.println("Singleton Eagar");
		SingletonEagar eagar = SingletonEagar.getSingletonInstance();
		System.out.println("eagar1:" + eagar);
		SingletonEagar eagar1 = SingletonEagar.getSingletonInstance();
		System.out.println("eagar1:" + eagar1);
		System.out.println("Singleton Lazy");
		SingletonLazy singletonLazy = SingletonLazy.getSingletonLazyInstance();
		System.out.println("singletonLazy:" + singletonLazy);
		SingletonLazy singletonLazy2 = SingletonLazy.getSingletonLazyInstance();
		System.out.println("singletonLazy2:" + singletonLazy2);
	}

}
