package com.pool.design.banas.intro;

import com.learn.design.banas.Stratagy.ItCanFly;

public class Dog extends Animal {
	public void digHole() {
		System.out.println("Dig Hole");
	}

	public Dog() {
		super();
		setSound("Bark");
		flyType=new ItCanFly();
	}
	
	public void changeVar(int randVal) {
		randVal=12;
		System.out.println("Random value:"+randVal);
	}
	
}
