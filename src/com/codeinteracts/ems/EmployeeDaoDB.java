package com.codeinteracts.ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	public void addTable() {
		Connection con = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			//			String query = "Create table if not exists emp1 (id int not null, fistname varchar(20) not null)";
			
			StringBuilder query = new StringBuilder();
			query.append("Create table if not exists emp1 (id int not null, fistname varchar(20) not null)");
			
			statement = con.createStatement();
			statement.execute(query.toString());
			
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
	public void viewAll() throws IOException {
		Connection con = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String query = "SELECT * from employee";
			
			//			System.out.println(query);
			
			statement = con.createStatement();
			
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				
				if (results.getString(7).equals("ADMIN")) {
					continue;
				}
				
				System.out.println(results.getInt(1));
				System.out.println(results.getString(2));
				System.out.println(results.getString(3));
				System.out.println(results.getString(4));
				System.out.println(results.getString(5));
				System.out.println(results.getString(6));
				System.out.println(results.getBoolean(8));
				
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
		Connection con = null;
		Statement statement = null;
		Employee emp = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String query = "select * from employee where id =" + id;
			
			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				emp = new Employee();
				emp.setId(results.getInt(1));
				emp.setFirstName(results.getString(2));
				emp.setLastName(results.getString(3));
				emp.setGender(Gender.getByValue(results.getString(4)));
				emp.setUsername(results.getString(5));
				emp.setPassword(results.getString(6));
				emp.setEmployeeType(EmployeeType.valueOf(results.getString(7)));
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
		
		return emp;
		
	}
	
	@Override
	public Employee searchByUsernameAndPassword(String username, String password) throws IOException {
		System.out.println("Inside search by username and password method.. EmployeeDaoDb. DB store \n\n");
		Connection con = null;
		Statement statement = null;
		Employee emp = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String query = "select * from employee where username ='" + username + "' and password='" + password + "'";
			
			System.out.println(query);
			
			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				emp = new Employee();
				emp.setId(results.getInt(1));
				emp.setFirstName(results.getString(2));
				emp.setLastName(results.getString(3));
				emp.setGender(Gender.getByValue(results.getString(4)));
				emp.setUsername(results.getString(5));
				emp.setPassword(results.getString(6));
				emp.setEmployeeType(EmployeeType.valueOf(results.getString(7)));
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
		
		return emp;
	}
	
	@Override
	public Employee addEmployee(Employee emp) throws IOException, SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		//		String insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)"
		//		        + "value ( '" + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		
		String insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)"
		        + "value (?, ?, ?, ?, ?, ?)";
		
		System.out.println(insertQuery);
		
		//		Statement statement = con.createStatement();
		
		PreparedStatement statement = con.prepareStatement(insertQuery);
		statement.setString(1, emp.getFirstName());
		statement.setString(5, emp.getPassword());
		statement.setString(6, emp.getEmployeeType().value);
		statement.setString(2, emp.getLastName());
		statement.setString(3, emp.getGender().value);
		statement.setString(4, emp.getUsername());

		int resultValue = statement.executeUpdate(insertQuery);
		
		
		//Batch insertation example
		
		//		insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)" + "value ( '"
		//		        + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		//		
		//		statement.addBatch(insertQuery);
		//		
		//		insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)" + "value ( '"
		//		        + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		//		
		//		statement.addBatch(insertQuery);
		//		
		//		insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)" + "value ( '"
		//		        + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		//		
		//		statement.addBatch(insertQuery);
		//		
		//		insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)" + "value ( '"
		//		        + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		//		
		//		statement.addBatch(insertQuery);
		//		
		//		insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)" + "value ( '"
		//		        + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		//		
		//		statement.addBatch(insertQuery);
		//		
		//		insertQuery = "INSERT INTO employee (first_name, last_name, gender, username, password, employee_type)" + "value ( '"
		//		        + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getGender().value + "', '"
		//		        + emp.getUsername() + "', '" + emp.getPassword() + "', '" + emp.getEmployeeType().value + "')";
		//		
		//		statement.addBatch(insertQuery);
		//		
		//		statement.executeBatch();
		
		if (resultValue == 0) {
			System.out.println("Failed to insert data. Check your data and try again.");
		}
		
		statement.close();
		con.close();
		
		return emp;
		
	}
	
	@Override
	public Employee searchByUsername(String username) throws IOException {
		Connection con = null;
		Statement statement = null;
		Employee emp = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String query = "select * from employee where username ='" + username + "'";
			
			System.out.println(query);
			
			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				emp = new Employee();
				emp.setId(results.getInt(1));
				emp.setFirstName(results.getString(2));
				emp.setLastName(results.getString(3));
				emp.setGender(Gender.getByValue(results.getString(4)));
				emp.setUsername(results.getString(5));
				emp.setPassword(results.getString(6));
				emp.setEmployeeType(EmployeeType.valueOf(results.getString(7)));
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
		
		return emp;
	}
	
	@Override
	public void removeEmployee(String id) throws IOException {
		// TODO Auto-generated method stub
		Connection con = null;
//		Statement statement = null;
		PreparedStatement statement = null;
		Employee emp = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String query = "DELETE from employee where id=?";
			
			statement = con.prepareStatement(query);
			
			statement.setString(1, id);
			
			System.out.println(statement.toString());

			int rowsAffected = statement.executeUpdate(query);
			
			System.out.println("rows==" + rowsAffected);
			if (rowsAffected > 0) {
				System.out.println("Successfully Deleted!!");
			} else {
				System.out.println("Failed to delete record");
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
	
}
