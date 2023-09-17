package com.pool.design.structural.composite.LeafObjects;

import com.pool.design.structural.composite.BaseComponent.Subject;

public class Science implements Subject {

	@Override
	public void addInstituteName(String instituteName) {
		System.out.println("Institute Name:" + instituteName);
	}

}
