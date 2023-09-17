package com.pool.design.Strategy.SimUDuck;

public abstract class Duck {
	
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("DUCK SWIMS");
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	
}
