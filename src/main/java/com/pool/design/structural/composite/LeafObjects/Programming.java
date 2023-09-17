package com.pool.design.structural.composite.LeafObjects;


import com.pool.design.structural.composite.BaseComponent.Subject;

public class Programming implements Subject {

	@Override
	public void addInstituteName(String instituteName) {
		System.out.println("Instutute Name:"+instituteName);
	}


}
