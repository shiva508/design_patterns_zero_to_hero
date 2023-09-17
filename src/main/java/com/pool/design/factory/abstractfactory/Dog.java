package com.pool.design.factory.abstractfactory;

public class Dog implements Animal {

	@Override
	public String getAnimal() {

		return "Dog";
	}

	@Override
	public String makeSound() {
		return "BOW BOW";
	}

}
