package com.pool.design.singleton.head;

public class SingletonHead {
	private static SingletonHead singletonHead;
	private Integer userId;

	private SingletonHead() {

	}

	public static SingletonHead singletonHeadIInstance() {
		if (singletonHead == null) {
			singletonHead = new SingletonHead();
			singletonHead.userId=508;
		}
		return singletonHead;
	}

	public Integer getUserId() {
		return userId;
	}
	
}
