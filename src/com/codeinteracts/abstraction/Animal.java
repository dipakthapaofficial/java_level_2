package com.codeinteracts.abstraction;


public abstract class Animal {
	
	void sleep() {
		System.out.println("Animal sleeps");
	}
	
	abstract void eat();
	
	abstract void makeSound();

}
