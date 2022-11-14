package com.codeinteracts.ems;


public class Employee {
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private Gender gender;
	
	private String username;
	
	private String password;
	
	private EmployeeType employeeType;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String firstName, String lastName, Gender gender, String username, String password,
	    EmployeeType employeeType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.employeeType = employeeType;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
		        + ", username=" + username + ", employeeType=" + employeeType + "]";
	}
	
}
