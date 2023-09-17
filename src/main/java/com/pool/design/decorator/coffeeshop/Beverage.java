package com.pool.design.decorator.coffeeshop;

public abstract class Beverage {
	public String description = "Unknow Beverage";

	public String getDescription() {
		return description;
	}

	public abstract Float cost();
}
