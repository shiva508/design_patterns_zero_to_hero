package com.pool.design.Strategy.SimUDuck;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flys with Racket Power");
	}

}
