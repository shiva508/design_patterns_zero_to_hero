package com.pool.design.Strategy.SimUDuck;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly With Wings");
	}

}
