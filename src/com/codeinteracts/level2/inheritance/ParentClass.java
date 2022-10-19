package com.codeinteracts.level2.inheritance;

public class ParentClass {
	
	String firstName;
	
	String lastName;
	
	Long salary;
	
	void printFamilyName() {
		System.out.println("Inside print family name.. parent class");
		System.out.println(lastName);
	}
	
	void printSalary() {
		System.out.println(salary);
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
}
