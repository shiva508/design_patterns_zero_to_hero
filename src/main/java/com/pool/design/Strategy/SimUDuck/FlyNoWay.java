package com.pool.design.Strategy.SimUDuck;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can not fly ");
	}
}
