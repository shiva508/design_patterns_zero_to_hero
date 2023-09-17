package com.pool.design.Strategy.SimUDuck;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Can not Quack");
	}

}
