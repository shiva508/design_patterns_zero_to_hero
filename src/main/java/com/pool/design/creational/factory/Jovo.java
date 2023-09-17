package com.pool.design.creational.factory;

public class Jovo implements ProgramingLanguage {
	
	private String languageName;
	
	private String experience;

	public Jovo(String languageName, String experience) {
		this.languageName = languageName;
		this.experience = experience;
	}

	@Override
	public String getProgramingLanguageName() {
		return this.languageName;
	}

	@Override
	public String getProgramingExperience() {
		return this.experience;
	}

	@Override
	public String toString() {
		return "Jovo [languageName=" + languageName + ", experience=" + experience + "]";
	}

}
