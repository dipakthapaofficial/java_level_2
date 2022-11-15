package com.codeinteracts.ems;

import java.util.Scanner;

/**
 * Project execution starts from here.
 * 
 * @author ubuntu
 */
public class Main {
	
	public static void main(String[] args) {
		//Initialize service and utilities
		Scanner scan = new Scanner(System.in);
		LoginService loginService = new LoginService();
		EmployeeService empService = new EmployeeService();
		Employee emp = null;
		
		while (true) {
			System.out.println("\n\n \t\t\t\t Welcome to Employee Management System\t\t\n\n");
			
			boolean isLoggedIn = false;
			
			System.out.println("Enter your username::");
			String username = scan.next();
			
			System.out.println("Enter your password");
			String password = scan.next();
			emp = loginService.login(username, password);
			
			if (emp != null) {
				System.out.println("User logged in Successfully.");
				isLoggedIn = true;
			} else {
				System.out.println("Login Failed. Incorrect username/password. Try again.");
				continue;
			}
			
			System.out.println("Welcome, " + emp.getFirstName() + " " + emp.getLastName());
			
			int choice = 0;
			
			if (emp.getEmployeeType() == EmployeeType.ADMIN) {
				
				while (true) {
					//Admin functionalities
					System.out.println("1. Add Employee");
					System.out.println("2. View Profile");
					System.out.println("3. Edit Profile");
					System.out.println("4. View All");
					System.out.println("5. Search by id");
					System.out.println("6. Remove Employee");
					System.out.println("7. Logout");
					System.out.println("Enter your choice::");
					
					choice = scan.nextInt();
					if (choice == 1) {
						//Add employee
						empService.addEmployee(scan);
					} else if (choice == 2) {
						//View Profile
						empService.viewProfile(emp);
					} else if (choice == 3) {
						//Edit Profile
						empService.editProfile(emp, scan);
					} else if (choice == 4) {
						//View all employee
						empService.viewAll();
					} else if (choice == 5) {
						//Search employee
						
					} else if (choice == 6) {
						//Remove Employee
						empService.removeEmployee(scan);
						
					} else if (choice == 7) {
						//Logout
						System.out.println("Logged out successfully!");
						break;
					} else {
						System.out.println("Invalid Choice.");
					}
				}
				
			} else if (emp.getEmployeeType() == EmployeeType.USER) {
				while (true) {
					//User functionalities
					System.out.println("1. View Profile");
					System.out.println("2. Edit Profile");
					System.out.println("3. Logout");
					System.out.println("Enter your choice::");
					
					choice = scan.nextInt();
					if (choice == 1) {
						//View Profile
						empService.viewProfile(emp);
					} else if (choice == 2) {
						//Edit Profile
						empService.editProfile(emp, scan);
					} else if (choice == 3) {
						//Logout
						System.out.println("Logged out successfully!");
						break;
					} else {
						System.out.println("Invalid Choice.");
					}
				}
			}
			
		}
		
	}
	
}
