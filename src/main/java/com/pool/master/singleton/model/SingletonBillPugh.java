package com.pool.master.singleton.model;

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
