package com.codeinteracts.level2.oop.encapsulation;


public class MainClass {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.firstName = "John";
		student1.lastName = "Doe";
		student1.age = "20";
		student1.gender = "male";
		student1.setId("1");
		System.out.println(student1.getId());
		//		student1.id = "1";
		//		student1.password = "password";
		
		Student student2 = new Student();
		student2.firstName = "Jane";
		student2.lastName = "Doe";
		student2.age = "20";
		student2.gender = "female";
		//		student2.id = "2";
		//		student2.password = "password";
		
		student1.printName();
		student2.printName();
	}
	
}
