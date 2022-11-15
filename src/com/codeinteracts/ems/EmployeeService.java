package com.codeinteracts.ems;

import java.io.IOException;

public class EmployeeService {
	
	public void viewAll() {
		//		for (Employee emp : EmployeeDao.employeeList) {
		//			if (emp != null) {
		//				System.out.println(emp);
		//			}
		//			
		//		}
	}
	
	/**
	 * Search employee by id
	 * 
	 * @param id
	 * @return
	 */
	public Employee searchById(Integer id) {
		//		for (Employee emp : EmployeeDao.employeeList) {
		//			if (emp != null && emp.getId() == id) {
		//				return emp;
		//			}
		//		}
		return null;
	}
	
	boolean removeEmployee(Integer id) {
		System.out.println("Enter employee id::");
		
		Employee emp = this.searchById(id);
		if (emp == null) {
			System.out.println("Employee id is not valid!!!");
			return false;
		}
		
		EmployeeDao dao = new EmployeeDao();
		//		dao.removeEmployee(emp);
		
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
	//	public void editProfile(Employee emp, Scanner sc) {
	//		EmployeeDao dao = new EmployeeDao();
	//		dao.editEmployee(emp);
	//	}
	
	public Employee addEmployee(Employee emp) throws IOException {
		EmployeeDao dao = new EmployeeDao();
		dao.addEmployee(emp);
		System.out.println("employee addedd successfully!");
		return emp;
	}
	
	boolean checkIfUserNameExists(String username) {
		//			for (Employee emp : EmployeeDao.employeeList) {
		//				if (emp != null && emp.getUsername().equals(username)) {
		//					return true;
		//				}
		//			}
		
		EmployeeDao dao = new EmployeeDao();
		Employee emp = null;
		try {
			emp = dao.searchByUsername(username);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some issue occurred");
			e.printStackTrace();
		}
		if (emp == null) {
			return false;
		} else {
			return true;
		}
	}
	
}
