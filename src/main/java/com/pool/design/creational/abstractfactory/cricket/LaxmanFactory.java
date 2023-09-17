package com.pool.design.creational.abstractfactory.cricket;

public class LaxmanFactory implements CricketAbstactFactory {
	private String name;
	private String runs;
	
	public LaxmanFactory(String name, String runs) {
		super();
		this.name = name;
		this.runs = runs;
	}

	@Override
	public Cricketer createCricketer() {
		return new Laxman(name, runs);
	}

}
