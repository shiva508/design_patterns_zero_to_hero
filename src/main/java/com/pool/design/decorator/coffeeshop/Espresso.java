package com.pool.design.decorator.coffeeshop;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public Float cost() {
		return 108f;
	}

}
