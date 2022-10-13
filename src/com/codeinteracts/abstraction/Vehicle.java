package com.codeinteracts.abstraction;


public interface Vehicle {
	
	void getEngine();
	
	void getVIN();
	
	void getColor();
	
	void getVehicleType();
	
	void getBrand();
	
	default void doSomething() {
		System.out.println("do something method of interface");
	}
	
	default void doSomethingAgain() {
		System.out.println("do something method of interface");
	}
}
