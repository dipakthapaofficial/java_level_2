package com.exceptions.enums;

import java.util.Scanner;

public class Employee {
	
	String firstName;
	
	Gender gender;
	
	public Employee insertData() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("enter first name::");
		String firstName = sc.nextLine();
		System.out.println("select gender::");
		for (Gender gen : Gender.values()) {
			System.out.print(gen.getId() + "." + gen);
			System.out.println();
		}
		
		int genderId = sc.nextInt();
		emp.firstName = firstName;
		emp.gender = Gender.findGenderById(genderId);
		return emp;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp = emp.insertData();
		System.out.println(emp.toString());
		
		Employee emp2 = new Employee();
		emp2 = emp2.insertData();
		System.out.println(emp2.toString());
		
		System.out.println(emp.gender == emp2.gender);
		
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", gender=" + gender + "]";
	}
	
}
