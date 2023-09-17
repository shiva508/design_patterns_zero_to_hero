package com.pool.design.banas.intro;

public abstract class Creature {
	protected String name;
	protected int weight;
	protected String sound;

	public abstract void setName(String name);

	public abstract String getName();

	public abstract void setWeight(int weight);

	public abstract String getWeight();
}
