package com.learn.design.factory;



public class ProgramingLanguageFactory {
	public  ProgramingLanguage getlaptopInstance(LANGUAGETYPE languageType,String languageName, String experience) {
		ProgramingLanguage INSTANCE=null;
		switch (languageType) {
		case JAVA: 
			INSTANCE=new Java(languageName, experience);
			break;
		
		
	}
		return INSTANCE;
	}
}
