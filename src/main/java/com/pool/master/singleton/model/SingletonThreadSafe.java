package com.pool.master.singleton.model;

public class SingletonThreadSafe {
	private static SingletonThreadSafe singletonThreadSafe;

	private SingletonThreadSafe() {

	}

	public static synchronized SingletonThreadSafe getSingletonThreadSafe() {
		if (null == singletonThreadSafe) {
			singletonThreadSafe = new SingletonThreadSafe();
		}
		return singletonThreadSafe;
	}

}
