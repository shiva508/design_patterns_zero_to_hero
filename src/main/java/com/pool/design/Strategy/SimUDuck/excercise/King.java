package com.pool.design.Strategy.SimUDuck.excercise;

public class King extends Character {
	
	@Override
	public void fight() {
		System.out.println("King fight using :" );
		weaponBehavior.useWeapon();
		
	}
}
