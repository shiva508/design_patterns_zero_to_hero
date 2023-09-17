package com.pool.design.Strategy.SimUDuck.excercise;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Using Knife cutting heads of enemy");
	}

}
