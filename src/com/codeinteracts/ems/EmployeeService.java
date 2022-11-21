package com.codeinteracts.ems;

import java.io.IOException;
import java.sql.SQLException;

public class EmployeeService {
	
	public void viewAll() throws IOException {
		EmployeeDaoInterface dao = new EmployeeDao();
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
		EmployeeDaoInterface dao = new EmployeeDaoDB();
		
		return dao.searchById(id);
	}
	
	boolean removeEmployee(Integer id) throws IOException {
		System.out.println("Enter employee id::");
		
		Employee emp = this.searchById(id);
		if (emp == null) {
			System.out.println("Employee id is not valid!!!");
			return false;
		}
		
		EmployeeDaoInterface dao = new EmployeeDaoDB();
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
		EmployeeDaoInterface dao = new EmployeeDaoDB();
		dao.editEmployee(emp);
		System.out.println("Edited Successfully.");
	}
	
	public Employee addEmployee(Employee emp) throws IOException, SQLException, ClassNotFoundException {
		EmployeeDaoInterface dao = new EmployeeDaoDB();
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
		
		EmployeeDaoInterface dao = new EmployeeDaoDB();
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
