package com.learn.design.abstractfactory.cricket;

public class CricketerFactory {
	public static Cricketer getCrickter(CricketAbstactFactory factory) {
		return factory.createCricketer();
	}
}
