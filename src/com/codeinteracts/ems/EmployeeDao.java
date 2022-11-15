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
	
	/**
	 * Directly searching and replacing is not possible, we copy the content of file in string
	 * builder, then replace the content in builder. Then write the existing again in create mode
	 * and replace with value stored in builder
	 * 
	 * @param emp
	 * @throws IOException
	 */
	public void editEmployee(Employee emp) throws IOException {
		//Find the line, store it in string builder and replace the content with new employee object
		BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
		String line = reader.readLine();
		StringBuilder builder = new StringBuilder();
		while (line != null) {
			String[] values = line.split(", ");
			boolean matches = false;
			for (String val : values) {
				if (val.contains("id") && val.equals("id=" + emp.getId())) {
					matches = true;
					break;
				}
			}
			if (matches) {
				builder.append(emp.toString());
			} else {
				builder.append(line);
			}
		}
		reader.close();
		
		//Now, open the same file and rewrite the file. It replaces old content with newly replaced content
		BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt"));
		bw.write(builder.toString());
		bw.write("\n");
		bw.flush();
		
		bw.close();
		
	}
	
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
		//Count number of lines in file and generate id based on that
		BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
		int count = (int) reader.lines().count();
		emp.setId(count++);
		reader.close();
		
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
	
	public void removeEmployee(Employee emp) throws IOException {
		//Find the line, store it in string builder and replace the content with empty string
		BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
		String line = reader.readLine();
		StringBuilder builder = new StringBuilder();
		while (line != null) {
			String[] values = line.split(", ");
			boolean matches = false;
			for (String val : values) {
				if (val.contains("id") && val.equals("id=" + emp.getId())) {
					matches = true;
					break;
				}
			}
			if (matches) {
				builder.append("");
			} else {
				builder.append(line);
			}
		}
		reader.close();
		
		//Now, open the same file and rewrite the file. It replaces old content with newly replaced content
		BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt"));
		bw.write(builder.toString());
		bw.write("\n");
		bw.flush();
		
		bw.close();
	}
	
}
