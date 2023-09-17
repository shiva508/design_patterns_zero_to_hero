package com.pool.design.decorator.coffeeshop;

public class Soy extends CondimentDecorator {

	Beverage beverageWithSoy;

	public Soy(Beverage beverageWithSoy) {
		this.beverageWithSoy = beverageWithSoy;
	}

	@Override
	public String getDescription() {
		return beverageWithSoy.getDescription()+",Soy";
	}

	@Override
	public Float cost() {
		return beverageWithSoy.cost()+18;
	}

}
