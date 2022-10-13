package com.codeinteracts.abstraction;


public class Dog extends Animal {
	
	@Override
	void sleep() {
		System.out.println("Dog sleeps");
	}
	
	@Override
	void eat() {
		System.out.println("Dog eats meat and dog food");
	}
	
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
	
	void checkIfIsPet() {
		System.out.println("Dog is a pet");
	}
	
}
