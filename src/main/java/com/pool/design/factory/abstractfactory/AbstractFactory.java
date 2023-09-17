package com.pool.design.factory.abstractfactory;

public interface AbstractFactory<T> {
	T create(String animalType);
}
