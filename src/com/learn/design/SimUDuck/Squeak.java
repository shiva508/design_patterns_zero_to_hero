package com.learn.design.SimUDuck;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Rubber Duck : SQUEAK");
	}

}
