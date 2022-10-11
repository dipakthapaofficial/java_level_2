package com.codeinteracts.level2;


public class MethodDemo {
	
	//	boolean checkSomething() {
	//		
	//	}
	
	int add(int a, int b) {
		System.out.println(a);
		int sum = a + b;
		
		this.displayResult(sum);
		
		return sum;
	}
	
	void displayResult(int result) {
		System.out.println("Print something");
		System.out.println("result=" + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1  = 10;
		int number2  = 10;
		
		MethodDemo demo = new MethodDemo();
		
		int result = demo.add(number1, number2);
		
		//		demo.displayResult(result);
		
		//		System.out.println("Result=" + result);
		
	}
	
}
