package com.learn.design.singleton;

public class SingletonBillPugh {
	
	private SingletonBillPugh() {

	}

	private static class SingletonGenerator {
		private static final SingletonBillPugh SINGLETONBILLPUGHINSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getSingletonBillPughInstance() {
		return SingletonGenerator.SINGLETONBILLPUGHINSTANCE;
	}
}
