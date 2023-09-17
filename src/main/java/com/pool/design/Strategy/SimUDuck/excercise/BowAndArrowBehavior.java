package com.pool.design.Strategy.SimUDuck.excercise;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Aim Enemy from distance");
	}

}
