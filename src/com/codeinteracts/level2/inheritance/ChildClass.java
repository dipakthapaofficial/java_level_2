package com.codeinteracts.level2.inheritance;


public class ChildClass extends ParentClass {
	
	String school;
	
	@Override
	void printFamilyName() {
		System.out.println("Inside print family name.. child class");
		System.out.println(lastName);
		super.printFamilyName();
	}
	
	@Override
	void printSalary() {
		System.out.println(salary - 100);
	}

}
