package com.pool.design.Strategy.SimUDuck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}

	@Override
	public void display() {
		System.out.println("MallardDuck DISPLAY");

	}

}
