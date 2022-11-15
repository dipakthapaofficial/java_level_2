package com.codeinteracts.ems;

import java.io.IOException;

public class EmployeeService {
	
	public void viewAll() throws IOException {
		//		for (Employee emp : EmployeeDao.employeeList) {
		//			if (emp != null) {
		//				System.out.println(emp);
		//			}
		//			
		//		}
		
		EmployeeDao dao = new EmployeeDao();
		dao.viewAll();
	}
	
	/**
	 * Search employee by id
	 * 
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public Employee searchById(Integer id) throws IOException {
		//		for (Employee emp : EmployeeDao.employeeList) {
		//			if (emp != null && emp.getId() == id) {
		//				return emp;
		//			}
		//		}
		EmployeeDao dao = new EmployeeDao();
		return dao.searchById(id);
	}
	
	boolean removeEmployee(Integer id) throws IOException {
		System.out.println("Enter employee id::");
		
		Employee emp = this.searchById(id);
		if (emp == null) {
			System.out.println("Employee id is not valid!!!");
			return false;
		}
		
		EmployeeDao dao = new EmployeeDao();
		dao.removeEmployee(id);
		
		System.out.println("Removed the account successfully!");
		
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
	 * @throws IOException
	 */
	public void editProfile(Employee emp) throws IOException {
		EmployeeDao dao = new EmployeeDao();
		dao.editEmployee(emp);
		System.out.println("Edited Successfully.");
	}
	
	public Employee addEmployee(Employee emp) throws IOException {
		EmployeeDao dao = new EmployeeDao();
		dao.addEmployee(emp);
		System.out.println("Employee added successfully!");
		return emp;
	}
	
	
	public boolean checkIfUserNameExists(String username) {
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
