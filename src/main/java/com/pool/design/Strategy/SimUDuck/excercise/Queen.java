package com.pool.design.Strategy.SimUDuck.excercise;

public class Queen extends Character {

	@Override
	public void fight() {
		System.out.println("Queen fights with:");
		weaponBehavior.useWeapon();
	}

}
