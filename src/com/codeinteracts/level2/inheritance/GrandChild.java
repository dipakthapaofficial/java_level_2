package com.codeinteracts.level2.inheritance;


public class GrandChild extends ChildClass {
	
	void printlastName() {
		System.out.println(lastName);
		super.printFamilyName();
	}
}
