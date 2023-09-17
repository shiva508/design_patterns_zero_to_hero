package com.pool.design.creational.abstractfactory;

public class LenevoFactory implements LaptopAbstractFactory {
	
	private String ram;
	private String price;

	
	public LenevoFactory(String ram, String price) {
		this.ram = ram;
		this.price = price;
	}


	@Override
	public Laptop createLaptop() {
		return new Lenevo(ram, price);
	}

}
