package com.pool.design.creational.abstractfactory.cricket;

public class SachineFactory implements CricketAbstactFactory {
	private String name;
	private String runs;
	
	public SachineFactory(String name, String runs) {
		super();
		this.name = name;
		this.runs = runs;
	}

	@Override
	public Cricketer createCricketer() {
		return new Sachine(name, runs);
	}

}
