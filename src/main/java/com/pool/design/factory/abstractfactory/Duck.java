package com.pool.design.factory.abstractfactory;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "Duck";
	}

	@Override
	public String makeSound() {
		return "Squeks";
	}

}
