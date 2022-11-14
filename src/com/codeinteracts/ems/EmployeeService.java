package com.codeinteracts.ems;

import java.util.Scanner;

public class EmployeeService {
	
	static Employee[] employeeList = new Employee[100];
	
	static int index = 0;
	
	static int runningId = 1;
	
	static {
		Employee emp = new Employee();
		emp.setId(runningId++);
		emp.setFirstName("Admin");
		emp.setLastName("Admin");
		emp.setGender(Gender.OTHERS);
		emp.setEmployeeType(EmployeeType.ADMIN);
		emp.setUsername("admin");
		emp.setPassword("admin");
		
		employeeList[index++] = emp;
		
	}
	
	public void viewAll() {
		for (Employee emp : EmployeeService.employeeList) {
			if (emp != null) {
				System.out.println(emp);
			}
			
		}
	}
	
	public Employee addEmployee(Scanner sc) {
		System.out.println("Enter first name::");
		String firstName = sc.next();
		
		System.out.println("Enter last name::");
		String lastName = sc.next();
		
		Gender g = null;
		while (true) {
			System.out.println("1.Male\t 2.Female\t 3.Others");
			System.out.println("Choose the gender.");
			int choice = sc.nextInt();
			if (choice == 1) {
				g = Gender.MALE;
			} else if (choice == 2) {
				g = Gender.FEMALE;
			} else if (choice == 3) {
				g = Gender.OTHERS;
			} else {
				System.out.println("Invalid option.");
				continue;
			}
			break;
		}
		
		EmployeeType type = null;
		while (true) {
			System.out.println("1.Admin\t 2.User");
			System.out.println("Choose the employee type.");
			int choice = sc.nextInt();
			if (choice == 1) {
				type = EmployeeType.ADMIN;
			} else if (choice == 2) {
				type = EmployeeType.USER;
			} else {
				System.out.println("Invalid option.");
				continue;
			}
			break;
		}
		
		System.out.println("Enter username::");
		String username = sc.next();
		
		System.out.println("Enter password::");
		String password = sc.next();
		
		
		//Set id based on array index value
		int id = runningId++;
		
		Employee emp = new Employee(id, firstName, lastName, g, username, password, type);
		
		employeeList[index++] = emp;
		
		System.out.println("Employee added successfully!");
		
		return emp;
	}
}
