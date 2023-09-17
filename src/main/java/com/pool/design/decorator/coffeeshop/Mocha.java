package com.pool.design.decorator.coffeeshop;

public class Mocha extends CondimentDecorator {
	
	Beverage beverageWithMocha;
	

	public Mocha(Beverage beverageWithMocha) {
		this.beverageWithMocha = beverageWithMocha;
	}

	@Override
	public String getDescription() {
		return beverageWithMocha.getDescription()+",Mocha";
	}

	@Override
	public Float cost() {
		return beverageWithMocha.cost()+508;
	}

}
