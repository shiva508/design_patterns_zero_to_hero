package com.pool.design.decorator.coffeeshop;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description="House Blend Coffee";
	}

	@Override
	public Float cost() {
		return 1.1f;
	}

}
