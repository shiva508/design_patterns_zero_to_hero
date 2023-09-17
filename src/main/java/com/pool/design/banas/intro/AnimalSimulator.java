package com.pool.design.banas.intro;

public class AnimalSimulator {
	public static void main(String[] args) {
		Dog april = new Dog();
		april.setName("APRIL");
		System.out.println(april.getName());
		april.digHole();
		april.setWeight(-1);
		int randVal = 10;
		april.changeVar(randVal);
		System.out.println("After rand value:" + randVal);
		changePropsUsingObject(april);
		System.out.println(april.getName());
	}

	public static void changePropsUsingObject(Dog dog) {
		dog.setName("MAY");
	}

}
