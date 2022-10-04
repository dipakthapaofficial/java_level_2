package com.codeinteracts.level2;


public class MainDemo {
	
	public static void main(String[] args) {
		//		SimpleCalculator calc1 = new SimpleCalculator();
		//		
		//		//		calc1.add(num1, num2);
		//		//		
		//		//		calc2.subtract();
		//		Something sth = new Something();
		//		
		//		SomethingChild sth1 = new SomethingChild();SimpleCalculator calc1 = new SimpleCalculator();
		//		
		//		//		calc1.add(num1, num2);
		//		//		
		//		//		calc2.subtract();
		//		Something sth = new Something();
		//		
		//		SomethingChild sth1 = new SomethingChild();
		
		TeacherClass teacher1 = new TeacherClass();
		teacher1.firstName = "Dipak";
		teacher1.lastName = "Thapa";
		teacher1.gender = "male";
		teacher1.id = 1;
		

		TeacherClass teacher2 = new TeacherClass();
		teacher2.firstName = "Ramesh";
		teacher2.lastName = "Thapa";
		teacher2.gender = "male";
		teacher2.id = 2;
		
		
		TeacherClass teacher3 = new TeacherClass("Jane", "doe", "female", 3);
		
		teacher3.printProperties();
		teacher1.printProperties();
		teacher2.printProperties();
		
		int[] a = { 1, 2, 3, 4, 5 };
		int target = 5;
		
		//		String word = "This is an apples ";
		//		output = 6

	}
	
}
