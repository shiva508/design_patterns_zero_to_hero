package com.pool.design.creational.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		instanceCreater("java", "JAVA", "3");
	}

	private static void instanceCreater(String type, String languageName, String experience) {
		ProgramingLanguage language;
		if (type.equals("java")) {
			language = new Java(languageName, experience);

		} else {
			language = new Jovo(languageName, experience);
		}
		System.out.println(language);
	}

}
