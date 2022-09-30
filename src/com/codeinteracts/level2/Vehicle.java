package com.codeinteracts.level2;

public class Vehicle {
	
	Vehicle() {
		
	}

	Vehicle(String color, String engine, String engineType) {
		this.color = color;
		this.engine = engine;
		this.engineType = engineType;
	}
	
	String color;
	
	String engine;
	
	String engineType;
	
	public static void main(String[] args) {
		//		Vehicle ford = new Vehicle("blue", "V4", "hybrid");
		//		//		ford.color = "blue";
		//		//		ford.engine = "V4";
		//		//		ford.engineType = "hybrid";
		//		
		//		Vehicle ferrari = new Vehicle("red", "something", "gas");
		
		Vehicle volswagon = new Vehicle();
		volswagon.color = "red";
		volswagon.engine = "something";
		volswagon.engineType = "gas";

		System.out.println(volswagon.color);
		
	}
	
}
