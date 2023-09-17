package com.pool.design.Strategy.SimUDuck.animal;

public class Dog extends AnimalAbstract implements AnimalInterface{
	public void bark() {
		System.out.println("DOG BARKS");
	}

	@Override
	public void makeSound() {
		System.out.println("Dog Makes Sound:BARK");
	}

	@Override
	public void makeSoundAbstract() {
		System.out.println("Dog Makes Abstract Sound:BARK");
	}
}
