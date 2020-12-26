package com.learn.design.SimUDuck.excercise;

public class Queen extends Character {

	@Override
	public void fight() {
		System.out.println("Queen fights with:");
		weaponBehavior.useWeapon();
	}

}
