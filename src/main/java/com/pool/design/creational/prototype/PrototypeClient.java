package com.pool.design.creational.prototype;

import java.util.List;

public class PrototypeClient {
	public static void main(String[] args) {
		Students student=new Students();
		student.loadDataFromDatabase();
		System.out.println(student.getStudentNames());
		try {
			Students student1=(Students) student.clone();
			List<String> student1Names= student1.getStudentNames();
			student1Names.remove("Shiva");
			System.out.println(student1Names);
			Students student2=(Students) student.clone();
			List<String> student2Names= student2.getStudentNames();
			System.out.println(student2Names);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
