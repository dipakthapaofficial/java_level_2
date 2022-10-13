package com.codeinteracts.level2.inheritance;

public class MainClass {
	
	int add(int a, int b) {
		System.out.println("Inside integer add method");
		return a + b;
	}
	
	float add(float a, float b) {
		System.out.println("Inside float add method");
		return a + b;
	}
	
	int add(int a, int b, int c) {
		System.out.println("Inside 3 integer add method");
		return a + b + c;
	}
	
	int add(int[] a) {
		System.out.println("Inside array integer add method");
		int sum = 0;
		return sum;
	}
	
	int add(int a, int b, int c, int... nums) {
		System.out.println("Inside multiple number integers add method");
		int sum = this.add(a, b, c);
		
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}
	
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
		
		//		parent.printFamilyName();
		//		
		//		child.printFamilyName();
		
		ParentClass p1 = new ParentClass();
		p1.printFamilyName();
		
		//		GrandChild grandChild = new GrandChild();
		//		grandChild.printlastName();
		//		
		//		MainClass main = new MainClass();
		//		int result = main.add(1, 2);
		//		System.out.println(result);
		//		
		//		float res1 = main.add(1f, 2f);
		//		System.out.println(res1);
		//		
		//		result = main.add(1, 2, 3);
		//		System.out.println(result);
		//		
		//		int a[] = { 1, 2, 3 };
		//		result = main.add(a);
		//		System.out.println(result);
		//		
		//		result = main.add(1, 2, 3, 4, 5, 6, 7);
		//		System.out.println(result);
		
	}
	
}
