package com.codeinteracts.level2.oop.encapsulation.sub_package;

import com.codeinteracts.methods.StudentClass;

public class MainClass {
	
	public static void main(String[] args) {
		StudentClass sc = new StudentClass();
		sc.firstName = "Dipak";
		sc.rollNumber = ++StudentClass.studentCount;
		
		StudentClass sc1 = new StudentClass();
		sc1.firstName = "John";
		sc1.rollNumber = ++StudentClass.studentCount;
		
		StudentClass sc3 = new StudentClass();
		sc3.firstName = "John";
		sc3.rollNumber = ++StudentClass.studentCount;
		
		System.out.println(sc.rollNumber);
		System.out.println(sc1.rollNumber);
		System.out.println(sc3.rollNumber);
		
		System.out.println(StudentClass.studentCount);
		
	}
	
}
