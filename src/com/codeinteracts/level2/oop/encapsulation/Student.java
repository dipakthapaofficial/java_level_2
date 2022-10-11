package com.codeinteracts.level2.oop.encapsulation;

public class Student {
	
	private String id;
	
	private String password;
	
	public String firstName;
	
	String lastName;
	
	String age;
	
	protected String gender;
	
	public String contactNumber;
	
	public void printName() {
		System.out.println(this.firstName + " " + this.lastName);
		System.out.println(this.password);
	}
	
	public String getId() {
		return this.id;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
}
