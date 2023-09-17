package com.pool.design.creational.factory;

public class Java implements ProgramingLanguage {
	private String languageName;
	private String experience;

	public Java(String languageName, String experience) {
		super();
		this.languageName = languageName;
		this.experience = experience;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public void setExperience(String experience) {
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
		return "Java [languageName=" + languageName + ", experience=" + experience + "]";
	}

}
