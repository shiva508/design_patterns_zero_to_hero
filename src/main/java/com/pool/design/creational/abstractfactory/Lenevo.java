package com.pool.design.creational.abstractfactory;

public class Lenevo implements Laptop {

	private String ram;
	private String price;

	public Lenevo(String ram, String price) {
		super();
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getPrice() {
		return this.price;
	}

}
