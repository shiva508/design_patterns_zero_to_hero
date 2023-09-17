package com.pool.design.creational.abstractfactory;

public class DellFactory implements LaptopAbstractFactory {
	private String ram;
	private String price;

	public DellFactory(String ram, String price) {
		super();
		this.ram = ram;
		this.price = price;
	}

	@Override
	public Laptop createLaptop() {

		return new Dell(ram, price);
	}

}
