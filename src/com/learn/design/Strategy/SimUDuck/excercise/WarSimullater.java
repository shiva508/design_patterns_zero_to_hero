package com.learn.design.Strategy.SimUDuck.excercise;

public class WarSimullater {

	public static void main(String[] args) {
		kingWarProcedure();
		queenWarProcedure();
	}

	private static void queenWarProcedure() {
		Character queen=new Queen();
		queen.setWeaponBehavior(new KnifeBehavior());
		queen.fight();
	}

	private static void kingWarProcedure() {
		Character king=new King();
		king.setWeaponBehavior(new SwordBehavior());
		king.fight();
	}

}
