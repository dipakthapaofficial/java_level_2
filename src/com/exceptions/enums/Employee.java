package com.exceptions.enums;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	
	public static Employee[] employees = new Employee[5];
	
	String firstName;
	
	Gender gender;
	
	public static Employee insertData() {
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
		
		//Login
		LocalDateTime checkin = LocalDateTime.now();
		
		//Logout
		LocalDateTime checkout = LocalDateTime.now();
		
		return emp;
	}
	
	public static void login(Scanner sc) {
		System.out.println("Enter id:");
		int id = sc.nextInt();
		
		System.out.println("Enter pass::");
		String pass = sc.nextLine();
		

	}
	
	public static void main(String[] args) {
		System.out.println("...........Employee management system..........");
		System.out.println("1. Add employee");
		System.out.println("2. login");
		System.out.println("3. logout");
		System.out.println("4. Get paycheck");
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		LocalDateTime date1 = LocalDateTime.now();
		LocalDateTime date2 = LocalDateTime.now();
		
		Date date3 = new Date();
		date3.getYear();
		
		switch (choice) {
			case 1:
				insertData();
				break;
			case 2:
				login(sc);
				break;
		}
		
		//		Integer emp1 = null;
		//		System.out.println(emp1 + 2);
		
		for (int i = 0; i < 1; i++) {
			Employee emp = new Employee();
			emp = emp.insertData();
			System.out.println(emp.toString());
			employees[i] = emp;
		}
		
		
		
		for (Employee emp : employees) {
			//			if (emp != null) {
			System.out.println(emp);
				System.out.println(emp.toString());
			//			}
		}
		
		//		Employee emp2 = new Employee();
		//		emp2 = emp2.insertData();
		//		System.out.println(emp2.toString());
		//		
		//		System.out.println(emp.gender == emp2.gender);
		//		
		//		Employee emp3 = new Employee();
		//		emp3 = emp3.insertData();
		//		System.out.println(emp3.toString());
		
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", gender=" + gender + "]";
	}
	
}
