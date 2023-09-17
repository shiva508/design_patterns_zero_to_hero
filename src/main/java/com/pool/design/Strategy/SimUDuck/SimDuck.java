package com.pool.design.Strategy.SimUDuck;

public class SimDuck {
	public static void main(String[] args) {
		operateMallardDuck();
		operateRedHeadDuck();
		operateRubberDuck();
		operateModelDuck();
	}

	private static void operateModelDuck() {
		Duck modelDuck=new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new  FlyRocketPowered());
		modelDuck.performFly();
		modelDuck.performQuack();
		
	}

	private static void operateRedHeadDuck() {
		Duck redHeadDuck=new RedHeadDuck();
		redHeadDuck.swim();
		redHeadDuck.display();
	}

	private static void operateMallardDuck() {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.performFly();
	}
	private static void operateRubberDuck() {
		Duck rubberDuck=new RubberDuck();
		rubberDuck.swim();
		rubberDuck.display();
		
	}
}
