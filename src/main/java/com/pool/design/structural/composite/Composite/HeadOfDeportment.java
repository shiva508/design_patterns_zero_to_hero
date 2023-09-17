package com.pool.design.structural.composite.Composite;

import java.util.ArrayList;
import java.util.List;

import com.pool.design.structural.composite.BaseComponent.Subject;

public class HeadOfDeportment implements Subject {

	List<Subject> subjects = new ArrayList<>();

	@Override
	public void addInstituteName(String instituteName) {
		subjects.forEach(sub -> sub.addInstituteName(instituteName));
		System.out.println(instituteName);
	}

	public void addSubject(Subject subject) {
		subjects.add(subject);
		System.out.println();
	}
	
	public void remove(Subject subject) {
		if(subjects.size()>0) {
			subjects.remove(subject);
			System.out.println("Removed :");
		}
	}

	public void clearEverything() {
		subjects.clear();
		System.out.println("Cleared :");
	}
	
}
