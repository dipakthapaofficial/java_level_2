package com.codeinteracts.level2;


public class TeacherClass {
	
	public TeacherClass() {
		
	}
	
	public TeacherClass(String firstName, String lastName, String gender, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.id = id;
	}
	
	String firstName;
	
	String lastName;
	
	String gender;
	
	int id;
	
	void printID() {
		System.out.println("Printing from teacher class");
		System.out.println(this.id);
	}
	
	void printProperties() {
		System.out.println("==============================================");
		System.out.println(this.id);
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.gender);
		System.out.println("==============================================");
	}

}
