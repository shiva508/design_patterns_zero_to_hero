package com.learn.design.singleton;

public class SingletonDoubleCheckedLocking {
	private static SingletonDoubleCheckedLocking doubleCheckedLocking;

	private SingletonDoubleCheckedLocking() {

	}

	public static SingletonDoubleCheckedLocking getDoubleCheckedLocking() {
		if (null == doubleCheckedLocking) {
			synchronized (SingletonDoubleCheckedLocking.class) {
				if (null == doubleCheckedLocking) {
					doubleCheckedLocking = new SingletonDoubleCheckedLocking();
				}
			}
		}
		return doubleCheckedLocking;
	}

}
