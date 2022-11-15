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
	
	/**
	 * Search employee by id
	 * 
	 * @param id
	 * @return
	 */
	public Employee searchById(Integer id) {
		for (Employee emp : EmployeeService.employeeList) {
			if (emp != null && emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}
	
	boolean removeEmployee(Scanner sc) {
		System.out.println("Enter employee id::");
		Integer id = sc.nextInt();
		
		Employee emp = this.searchById(id);
		if (emp == null) {
			System.out.println("Employee id is not valid!!!");
		} else {
			int index = id - 1;
			employeeList[index] = null;
			System.out.println("Removed successfully.");
		}

		return false;
	}
	
	/**
	 * Method to view current employee
	 */
	public void viewProfile(Employee emp) {
		if (emp != null) {
			System.out.println(emp);
		}
		
	}
	
	/**
	 * Edit employee profile
	 * 
	 * @param emp
	 */
	public void editProfile(Employee emp, Scanner sc) {
		System.out.println("Enter first name::");
		String firstName = sc.next();
		emp.setFirstName(firstName);
		
		System.out.println("Enter last name::");
		String lastName = sc.next();
		emp.setLastName(lastName);
		
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
		emp.setGender(g);
		
		System.out.println("Enter password::");
		String password = sc.next();
		emp.setPassword(password);
		
		System.out.println("Profile edited successfully!");
		
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
		
		String username = null;
		while (true) {
			System.out.println("Enter username::");
			username = sc.next();
			if (this.checkIfUserNameExists(username)) {
				System.out.println("This username has been taken.");
				continue;
			}
			break;
		}
		
		System.out.println("Enter password::");
		String password = sc.next();
		
		
		//Set id based on array index value
		int id = runningId++;
		
		Employee emp = new Employee(id, firstName, lastName, g, username, password, type);
		
		employeeList[index++] = emp;
		
		System.out.println("Employee added successfully!");
		
		return emp;
	}
	
	boolean checkIfUserNameExists(String username) {
		for (Employee emp : EmployeeService.employeeList) {
			if (emp != null && emp.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
}
