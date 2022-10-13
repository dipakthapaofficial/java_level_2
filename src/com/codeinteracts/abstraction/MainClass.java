package com.codeinteracts.abstraction;

public class MainClass {
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		//		Parent parent = new Child()
		
		animal.eat();
		animal.sleep();
		animal.makeSound();
		
		Animal animal1 = new Tiger();
		
		animal1.eat();
		animal1.sleep();
		animal1.makeSound();
		
		Vehicle v1 = new Mercedes();
		//		v1.checkRoof();
		
	}
	
}
