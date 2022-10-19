package com.codeinteracts.methods;

import java.util.Scanner;

public class MethodDemo {
	
	int i;
	
	int k;
	
	static int h = 10;
	
	MethodDemo() {
		k = 1;
	}
	
	MethodDemo(int k) {
		super();
		this.i = k;
	}
	
	int add(int a, int b) {
		int sum = a + b;
		System.out.println(k);
		return sum;
	}
	
	static int add(String str) {
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.i = 1;
		
		MethodDemo.h = 1;
		MethodDemo.add("1");
		
		String password = new Scanner(System.in).nextLine();
		
		boolean isValid = PasswordValidatorUtility.isValidPassword(password);
		
		int x = 2;
		int y = 3;
		
		MethodDemo.h = 2;
		int result = md.add(x, y);
		
		System.out.println("Result=" + result);
		
		int sum = 0;
		for (int j = 0; j < 10; j++) {
			sum += j;
			System.out.println(j);
		}
		
		System.out.println(sum);
		

	}
	
}

