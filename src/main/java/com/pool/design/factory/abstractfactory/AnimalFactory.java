package com.pool.design.factory.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
	}

}
