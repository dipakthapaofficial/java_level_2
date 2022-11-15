package com.codeinteracts.ems;

import java.io.IOException;
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
						System.out.println("Enter first name::");
						String firstName = scan.next();
						
						System.out.println("Enter last name::");
						String lastName = scan.next();
						
						Gender g = null;
						while (true) {
							System.out.println("1.Male\t 2.Female\t 3.Others");
							System.out.println("Choose the gender.");
							int genderChoice = scan.nextInt();
							if (genderChoice == 1) {
								g = Gender.MALE;
							} else if (genderChoice == 2) {
								g = Gender.FEMALE;
							} else if (genderChoice == 3) {
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
							int userChoice = scan.nextInt();
							if (userChoice == 1) {
								type = EmployeeType.ADMIN;
							} else if (userChoice == 2) {
								type = EmployeeType.USER;
							} else {
								System.out.println("Invalid option.");
								continue;
							}
							break;
						}
						
						String username1 = null;
						while (true) {
							System.out.println("Enter username::");
							username1 = scan.next();
							if (empService.checkIfUserNameExists(username)) {
								System.out.println("This username has been taken.");
								continue;
							}
							break;
						}
						
						System.out.println("Enter password::");
						String password1 = scan.next();
						
						//Set id based on array index value
						int id = EmployeeDao.runningId++;
						
						Employee emp1 = new Employee(id, firstName, lastName, g, username1, password1, type);
						
						try {
							empService.addEmployee(emp1);
						}
						catch (IOException e) {
							System.out.println("Can't add employee. Please try again later.");
							e.printStackTrace();
						}
					} else if (choice == 2) {
						//View Profile
						empService.viewProfile(emp);
						
						//	}				else if (choice == 3) {
					//						//Edit Profile
					//						empService.editProfile(emp, scan);
					//						System.out.println("Enter first name::");
					//						String firstName = scan.next();
					//						emp.setFirstName(firstName);
					//						
					//						System.out.println("Enter last name::");
					//						String lastName = scan.next();
					//						emp.setLastName(lastName);
					//						
					//						Gender g = null;
					//						while (true) {
					//							System.out.println("1.Male\t 2.Female\t 3.Others");
					//							System.out.println("Choose the gender.");
					//							int genderChoice = scan.nextInt();
					//							if (genderChoice == 1) {
					//								g = Gender.MALE;
					//							} else if (genderChoice == 2) {
					//								g = Gender.FEMALE;
					//							} else if (genderChoice == 3) {
					//								g = Gender.OTHERS;
					//							} else {
					//								System.out.println("Invalid option.");
					//								continue;
					//							}
					//							break;
					//						}
					//						emp.setGender(g);
					//						
					//						System.out.println("Enter password::");
					//						String password1 = scan.next();
					//						emp.setPassword(password1);
					//						
					//					}
					//					else if (choice == 4) {
					//						//View all employee
					//						empService.viewAll();
					//					} else if (choice == 5) {
					//						//Search employee
					//						
					//					} else if (choice == 6) {
					//						//Remove Employee
					//						System.out.println("Enter employee id::");
					//						Integer id = scan.nextInt();
					//						
					//						empService.removeEmployee(id);
					//						
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
						//						empService.editProfile(emp, scan);
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
