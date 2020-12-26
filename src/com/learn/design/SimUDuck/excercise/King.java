package com.learn.design.SimUDuck.excercise;

public class King extends Character {
	
	@Override
	public void fight() {
		System.out.println("King fight using :" );
		weaponBehavior.useWeapon();
		
	}
}
