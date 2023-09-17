package com.pool.design.structural.composite;

import com.learn.design.structural.composite.BaseComponent.Subject;
import com.learn.design.structural.composite.Composite.HeadOfDeportment;
import com.learn.design.structural.composite.LeafObjects.Programming;
import com.learn.design.structural.composite.LeafObjects.Science;

public class CompositClient {
	public static void main(String[] args) {
		Subject programmin = new Programming();
		Subject science = new Science();
		HeadOfDeportment deportment = new HeadOfDeportment();
		deportment.addSubject(programmin);
		deportment.addSubject(science);
		deportment.addInstituteName("ECE");
		
	}
}
