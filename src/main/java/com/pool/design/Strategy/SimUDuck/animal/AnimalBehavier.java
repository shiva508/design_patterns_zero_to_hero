package com.pool.design.Strategy.SimUDuck.animal;

public class AnimalBehavier {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
		AnimalInterface animalInterface=new Dog();
		animalInterface.makeSound();
		
		AnimalAbstract animalAbstract=new Dog();
		animalAbstract.makeSoundAbstract();
		
		AnimalInterface dynamicChildInstance=dynamicChieldClassPicker("");
		if(dynamicChildInstance instanceof Dog) {
			System.out.println("Instance of dog");
			dynamicChildInstance.makeSound();
		}else if(dynamicChildInstance instanceof Cat) {
			System.out.println("Instance of cat");
			dynamicChildInstance.makeSound();
		}
	}

	public static AnimalInterface dynamicChieldClassPicker(String chieldClassType) {
		AnimalInterface animalInterface=null;
		if(chieldClassType.equalsIgnoreCase("dog")) {
			animalInterface=new Dog();
		}else if(chieldClassType.equalsIgnoreCase("cat")) {
			animalInterface=new Cat();
		}
		
		return animalInterface;
	}
}
 