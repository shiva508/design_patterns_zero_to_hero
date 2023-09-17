package com.pool.design.creational.abstractfactory.cricket;

public class Lara implements Cricketer {
	
	private String name;
	private String runs;

	public Lara(String name, String runs) {
		this.name = name;
		this.runs = runs;
	}

	@Override
	public String getCsricketerName() {
		return this.name;
	}

	@Override
	public String getTotalRuns() {
		return this.runs;
	}

}
