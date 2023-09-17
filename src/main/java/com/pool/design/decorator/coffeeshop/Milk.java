package com.pool.design.decorator.coffeeshop;

public class Milk extends CondimentDecorator {

	Beverage beverageWithMilk;

	public Milk(Beverage beverageWithMilk) {
		this.beverageWithMilk = beverageWithMilk;
	}

	@Override
	public String getDescription() {
		return beverageWithMilk.getDescription()+",Milk";
	}

	@Override
	public Float cost() {
		return beverageWithMilk.cost()+208;
	}

}
