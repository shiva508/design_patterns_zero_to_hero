package com.learn.design.factory.abstractfactory;

public interface AbstractFactory<T> {
	T create(String animalType);
}
