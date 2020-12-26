package com.learn.design.SimUDuck.animal;

public class Cat implements AnimalInterface{

	@Override
	public void makeSound() {
		meow();
	}
	
	public void meow() {
		System.out.println("Cat Makes Sound:MEOW");
	}

}
