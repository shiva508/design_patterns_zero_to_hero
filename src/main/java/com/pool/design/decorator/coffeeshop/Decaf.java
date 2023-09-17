package com.pool.design.decorator.coffeeshop;

public class Decaf extends Beverage {
	public Decaf() {
		description="Decaf Coffee";
	}
	@Override
	public Float cost() {
		return 408f;
	}

}
