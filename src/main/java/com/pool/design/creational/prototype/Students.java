package com.pool.design.creational.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Students implements Cloneable, Serializable {
	private List<String> studentNames;

	public Students() {
		studentNames = new ArrayList<>();
	}

	public Students(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public List<String> getStudentNames() {
		return studentNames;
	}

	public void loadDataFromDatabase() {
		studentNames.add("Nithya");
		studentNames.add("Shiva");
		studentNames.add("Madhu");
		studentNames.add("Sai");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> clonned=this.studentNames.stream().collect(Collectors.toList());
		return new Students(clonned);
	}
}
