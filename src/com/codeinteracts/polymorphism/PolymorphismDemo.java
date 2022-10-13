package com.codeinteracts.polymorphism;


public class PolymorphismDemo {
	
	int add(int a) {
		System.out.println("INside integer addition of 1 numbers");
		return a;
	}
	
	int add(int a, int b) {
		System.out.println("INside integer addition of 2 numbers");
		return a + b;
	}
	
	float add(float a, float b) {
		System.out.println("INside float addition of 2 numbers");
		return a + b;
	}
	
	int add(int a, int b, int c) {
		System.out.println("INside integer addition of 3 numbers");
		return a + b + c;
	}
	
	int add(int a, int b, int c, int d) {
		System.out.println("INside integer addition of 4 numbers");
		return a + b + c + d;
	}
	
	int add(int... numbers) {
		System.out.println("INside integer addition of 5 or more numbers");
		//		int sum = a + b + c + d;
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		PolymorphismDemo demo = new PolymorphismDemo();
		int result = demo.add(2, 3);
		System.out.println(result);
		
		float res1 = demo.add(2f, 3f);
		System.out.println(result);
		
		result = demo.add(2, 3, 4);
		System.out.println(result);
		
		result = demo.add(2, 3, 4, 5);
		System.out.println(result);
		
		result = demo.add(2, 3, 4, 5, 6);
		System.out.println(result);
		
		result = demo.add(2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(result);
	}
	

}
