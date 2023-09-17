package com.pool.design.creational.abstractfactory.cricket;

public class Sachine implements Cricketer {
	private String name;
	private String runs;

	public Sachine(String name, String runs) {
		super();
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
