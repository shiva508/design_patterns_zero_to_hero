package com.learn.design.SimUDuck;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck Quacks");
	}

}
