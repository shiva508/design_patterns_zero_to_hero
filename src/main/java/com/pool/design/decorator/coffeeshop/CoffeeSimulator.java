package com.pool.design.decorator.coffeeshop;

public class CoffeeSimulator {

	public static void main(String[] args) {
		Beverage houseBlend=new HouseBlend();
		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());
		houseBlend=new Milk(houseBlend);
		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());
		houseBlend=new Mocha(houseBlend);
		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());
		houseBlend=new Soy(houseBlend);
		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());
	}

}
