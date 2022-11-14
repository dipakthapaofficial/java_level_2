package com.codeinteracts.ems;


public class LoginService {
	
	/**
	 * Log into the system
	 * 
	 * @param username
	 * @param password
	 * @return true if login is successful, else false
	 */
	Employee login(String username, String password) {
		
		for (Employee emp : EmployeeService.employeeList) {

			if (emp != null && emp.getUsername().equals(username) && emp.getPassword().equals(password)) {
				return emp;
			}
			
		}
		
		return null;
	}
	
}
