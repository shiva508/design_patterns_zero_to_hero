package com.learn.design.creational.prototype;

import java.util.List;

public class PrototypeClient {
	public static void main(String[] args) {
		Students student=new Students();
		student.loadDataFromDatabase();
		System.out.println(student.getStudentNames());
		try {
			Students student1=(Students) student.clone();
			List<String> student1Names= student1.getStudentNames();
			Students student2=(Students) student.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
