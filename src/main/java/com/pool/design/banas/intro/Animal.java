package com.pool.design.banas.intro;

import com.learn.design.banas.Stratagy.Fly;

public class Animal {
	private String name;
	private int weight;
	private String sound;
	public Fly flyType;

	public Animal() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight greter than 0");
		}
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getFlayType() {
		return flyType.flying();
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", sound=" + sound + "]";
	}

}
