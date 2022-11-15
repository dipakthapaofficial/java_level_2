package com.codeinteracts.ems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDao {
	
	//Storage Point
	//	static Employee[] employeeList = new Employee[100];
	//	
	//	static int index = 0;
	//	
	static int runningId = 1;
	//	
	//	static {
	//		Employee emp = new Employee();
	//		emp.setId(runningId++);
	//		emp.setFirstName("Admin");
	//		emp.setLastName("Admin");
	//		emp.setGender(Gender.OTHERS);
	//		emp.setEmployeeType(EmployeeType.ADMIN);
	//		emp.setUsername("admin");
	//		emp.setPassword("admin");
	//		
	//		
	//		EmployeeDao.employeeList[EmployeeDao.index++] = emp;
	//		
	//	}
	//	
	//		Employee addEmployee(Employee emp) {
	//			EmployeeDao.employeeList[EmployeeDao.index++] = emp;
	//			
	//			System.out.println("Employee added successfully!");
	//			
	//			return emp;
	//		}
	//	
	//	public void removeEmployee(Employee emp) {
	//		int index = emp.getId() - 1;
	//		EmployeeDao.employeeList[index] = null;
	//		System.out.println("Removed successfully.");
	//		
	//	}
	//	
	//	public void editEmployee(Employee emp) {
	//		//Nothing to edit
	//
	//	}
	
	//File Storage
	
	Employee searchByUsernameAndPassword(String username, String password) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
		
		String line = reader.readLine();
		Employee emp = null;
		
		while (line != null) {
			int count = 0;
			String[] values = line.split(", ");
			
			String firstName = null;
			String lastName = null;
			Integer id = null;
			Gender g = null;
			EmployeeType type = null;
			
			for (String val : values) {
				if (val.contains("username") && val.equals("username=" + username)) {
					count++;
				} else if (val.contains("password") && val.equals("password=" + password)) {
					count++;
				}
				
				if (val.contains("id=")) {
					String vals[] = val.split("=");
					id = Integer.parseInt(vals[1]);
				} else if (val.contains("firstName=")) {
					String vals[] = val.split("=");
					firstName = vals[1];
				} else if (val.contains("lastName=")) {
					String vals[] = val.split("=");
					lastName = vals[1];
				} else if (val.contains("gender=")) {
					String vals[] = val.split("=");
					String gender = vals[1];
					g = Gender.getByValue(gender);
				} else if (val.contains("employeeType=")) {
					String vals[] = val.split("=");
					String employeeType = vals[1];
					type = EmployeeType.getByValue(employeeType);
				}
			}
			
			if (count == 2) {
				emp = new Employee();
				emp.setId(id);
				emp.setFirstName(firstName);
				emp.setLastName(lastName);
				emp.setGender(g);
				emp.setEmployeeType(type);
				emp.setUsername(username);
				emp.setPassword(password);
				return emp;
			}
			
			line = reader.readLine();
			
		}
		reader.close();
		return emp;
	}
	
	Employee addEmployee(Employee emp) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt", true));
		bw.write(emp.toString());
		bw.write("\n");
		bw.flush();
		
		System.out.println("Employee added successfully!");
		
		bw.close();
		return emp;
	}
	
	public Employee searchByUsername(String username) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
		
		String line = reader.readLine();
		Employee emp = null;
		
		while (line != null) {
			int count = 0;
			String[] values = line.split(", ");
			
			String firstName = null;
			String lastName = null;
			Integer id = null;
			Gender g = null;
			EmployeeType type = null;
			
			for (String val : values) {
				if (val.contains("username") && val.equals("username=" + username)) {
					count++;
				}
				if (val.contains("id=")) {
					String vals[] = val.split("=");
					id = Integer.parseInt(vals[1]);
				} else if (val.contains("firstName=")) {
					String vals[] = val.split("=");
					firstName = vals[1];
				} else if (val.contains("lastName=")) {
					String vals[] = val.split("=");
					lastName = vals[1];
				} else if (val.contains("gender=")) {
					String vals[] = val.split("=");
					String gender = vals[1];
					g = Gender.getByValue(gender);
				} else if (val.contains("employeeType=")) {
					String vals[] = val.split("=");
					String employeeType = vals[1];
					type = EmployeeType.getByValue(employeeType);
				}
			}
			
			if (count == 1) {
				emp = new Employee();
				emp.setId(id);
				emp.setFirstName(firstName);
				emp.setLastName(lastName);
				emp.setGender(g);
				emp.setEmployeeType(type);
				emp.setUsername(username);
				return emp;
			}
			
			line = reader.readLine();
			
		}
		reader.close();
		return emp;
	}
	
}
