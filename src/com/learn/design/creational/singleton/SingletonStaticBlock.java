package com.learn.design.creational.singleton;

public class SingletonStaticBlock {
	private static SingletonStaticBlock singletonStaticBlock;

	private SingletonStaticBlock() {

	}

	static {
		try {
			singletonStaticBlock = new SingletonStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong");
		}

	}

	public static SingletonStaticBlock getSingletonStaticBlock() {
		return singletonStaticBlock;
	}

}
