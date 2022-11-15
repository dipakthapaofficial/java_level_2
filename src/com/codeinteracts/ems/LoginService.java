package com.codeinteracts.ems;

import java.io.IOException;

public class LoginService {
	
	/**
	 * Log into the system
	 * 
	 * @param username
	 * @param password
	 * @return true if login is successful, else false
	 */
	Employee login(String username, String password) {
		
		//		for (Employee emp : EmployeeDao.employeeList) {
		//
		//			if (emp != null && emp.getUsername().equals(username) && emp.getPassword().equals(password)) {
		//				return emp;
		//			}
		//			
		//		}
		
		EmployeeDao dao = new EmployeeDao();
		
		Employee emp = null;
		try {
			emp = dao.searchByUsernameAndPassword(username, password);
		}
		catch (IOException e) {
			System.out.println("Some issue occurred");
			e.printStackTrace();
		}
		
		return emp;
	}
	
}
