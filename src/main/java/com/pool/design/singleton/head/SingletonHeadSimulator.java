package com.pool.design.singleton.head;

public class SingletonHeadSimulator {
	public static void main(String[] args) {
		SingletonHead singletonHead = SingletonHead.singletonHeadIInstance();
		System.out.println(singletonHead);
		System.out.println(singletonHead.getUserId());
		System.out.println(singletonHead);
	}
}
