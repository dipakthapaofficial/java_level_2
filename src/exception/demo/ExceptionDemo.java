package exception.demo;

import java.io.IOException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

public class ExceptionDemo {
	
	void doSomething() {
		System.out.println("Do something");
		ExceptionDemo ex = new ExceptionDemo();
		doSomething();
	}
	
	/**
	 * Divide two numbers
	 * 
	 * @param a
	 * @param b
	 * @return int, quotient of the division
	 * @throws ArithmeticException
	 */
	
	int divide(int a, int b) throws ArithmeticException, RuntimeException {
		int result = 0;
		try {
			result = a / b;
		}
		catch (Exception e) {
			System.out.println("Do something");
		}
		
		System.out.println("After division");
		
		return result;
		
	}
	
	boolean login(String username, String password) throws LoginException {
		int[] a = { 1, 2, 3 };
		
//		try {
			if (a.length > 4) {
				int j = a[4];
			}
			
			if (username != null) {
				String[] something = username.split(" ");
			} else {
				System.out.println("Do something");
				
				throw new LoginException("Username is null");
			}
			
			//		}
	//		catch (NullPointerException e) {
	//			e.printStackTrace();
	//			System.out.println(username);
	//			//			e = new NullPointerException();
	//			
	//			throw new LoginException("NUll pointer exception occurred while trying to login.");
	//		}
		//Check username and password is valid or not
		//Login
		
		return true;
	}
	
	double compute(double hours, int id) throws IOException {
		//Get wage of the employee from network
		URL url;
		double result = 0;
		//		try {
		url = new URL("https://employee.codeinteracts.com/" + id);
		url.openConnection();
		
		//wage
		//			result = hours * wage;
		//		}
		//		catch ( e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		
		return result;
		
		//		
		//
		//		return result;
	}
	
	void demoSomething() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Inside try block");
			final int i = sc.nextInt();
			//			
			//			System.out.println(10 / i);
			
			//			URL url = new URL("https://www.something.com");
			//			url.openConnection();
			//			//		
			//			
			//			FileReader f = new FileReader("hello.txt");
			
			System.out.println("Successful");
		}
		catch (ArithmeticException e) {
			System.out.println("Inside catch block, doSomething method, ArithmeticException");
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("Inside catch block, doSomething method, input mismatch exception");
			e.printStackTrace();
		}
		//		catch (MalformedURLException e) {
		//			// TODO Auto-generated catch block
		//			System.out.println("Inside catch block, MalformedURLException");
		//			e.printStackTrace();
		//		}
		//		catch (FileNotFoundException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		catch (ArithmeticException | InputMismatchException | MalformedURLException | FileNotFoundException e) {
		//			System.out.println("Inside catch block, Grouped exceptions");
		//			e.printStackTrace();
		//		}
		//		catch (IOException e) {
		//			System.out.println("Inside catch block, IOException");
		//			e.printStackTrace();
		//		}
		finally {
			System.out.println("Finally block executed.");
			sc.close();
		}
		System.out.println("About to exit program");
	}
	
	public static void main(String[] args) {
		ExceptionDemo ex = new ExceptionDemo();
		//		ex.doSomething();
		
		//		try {
		//			ex.demoSomething();
		//		}
		//		catch (Exception e) {
		//			System.out.println("Inside Catch block, main method");
		//			e.printStackTrace();
		//		}
		
		//		System.out.println(ex.divide(10, 0));
		
		try {
			System.out.println(ex.login(null, "pass"));
			System.out.println("enter employee");
		}
		catch (LoginException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

		//		try {
		//			
		//		}
		//		catch (ArithmeticException e) {
		//			
		//		}
		
		System.out.println("About to exit");
		
		System.out.println(10 + 20);
		
	}
	
}
