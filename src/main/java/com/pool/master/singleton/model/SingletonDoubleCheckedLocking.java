package com.pool.master.singleton.model;

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
