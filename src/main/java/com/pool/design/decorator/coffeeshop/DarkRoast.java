package com.pool.design.decorator.coffeeshop;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description="Dark Roast Coffee";
	}

	@Override
	public Float cost() {
		return 2.3f;
	}

}
