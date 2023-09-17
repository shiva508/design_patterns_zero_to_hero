package com.pool.design.factory.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String animalType) {
		if("animalType".equals("Red")) {
			return new Red();
		}
		return null;
	}

}
