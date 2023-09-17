package com.pool.design.creational.abstractfactory.cricket;

public class LaraFactory implements CricketAbstactFactory {

	private String name;
	private String runs;
	
	
	public LaraFactory(String name, String runs) {
		super();
		this.name = name;
		this.runs = runs;
	}


	@Override
	public Cricketer createCricketer() {
		return new Lara(name,runs);
	}

}
