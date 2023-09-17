package com.pool.design.creational.abstractfactory.cricket;

public class Laxman implements Cricketer {

	private String name;
	private String runs;

	public Laxman(String name, String runs) {
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
