package com.codeinteracts.level2.inheritance;


public class MainClass {
	
	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		parent.firstName = "John";
		parent.lastName = "Wick";
		parent.salary = 2000L;
		
		ChildClass child = new ChildClass();
		child.firstName = "Jane";
		child.lastName = "Doe";
		child.salary = 2000L;
		child.school = "Something prep school";
		
		parent.printFamilyName();
		
		child.printFamilyName();
		
		GrandChild grandChild = new GrandChild();
		grandChild.printlastName();

	}
	
}
