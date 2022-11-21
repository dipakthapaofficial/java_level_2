package com.codeinteracts.ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDaoDB implements EmployeeDaoInterface {
	
	private final static String USERNAME = "root";
	
	private final static String PASSWORD = "root";
	
	private final static String URL = "jdbc:mysql://localhost:3306/ems";
	
	@Override
	public void editEmployee(Employee emp) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void viewAll() throws IOException {
		Connection con = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String query = "SELECT * from employee";
			
			System.out.println(query);
			
			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				System.out.println(results.getInt(1));
				System.out.println(results.getString(2));
				System.out.println(results.getString(3));
				System.out.println(results.getString(4));
				System.out.println(results.getString(5));
				System.out.println(results.getString(6));
			}

		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
				con.close();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
	@Override
	public Employee searchById(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employee searchByUsernameAndPassword(String username, String password) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employee addEmployee(Employee emp) throws IOException, SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		String insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)"
		        + "value ( '" + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		
		System.out.println(insertQuery);
		
		Statement statement = con.createStatement();
		statement.executeUpdate(insertQuery);
		
		statement.close();
		con.close();
		
		return emp;
		
	}
	
	@Override
	public Employee searchByUsername(String username) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void removeEmployee(Integer id) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
