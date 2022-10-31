package exception.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	void doSomething() {
		System.out.println("Do something");
		ExceptionDemo ex = new ExceptionDemo();
		doSomething();
	}
	
	void demoSomething() throws InputMismatchException {
		//		try {
			System.out.println("Inside try block");
			int i = new Scanner(System.in).nextInt();
			//			
			//			System.out.println(10 / i);
			
			//			URL url = new URL("https://www.something.com");
			//			//			url.openConnection();
			//			//		
			//			
			//			FileReader f = new FileReader("hello.txt");
			
			System.out.println("Successful");
			//		}
		//		catch (ArithmeticException e) {
		//			System.out.println("Inside catch block, ArithmeticException");
		//			e.printStackTrace();
		//		}
		//		catch (InputMismatchException e) {
		//			System.out.println("Inside catch block, input mismatch exception");
		//			e.printStackTrace();
		//		}
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
	}
	
	public static void main(String[] args) {
		ExceptionDemo ex = new ExceptionDemo();
		//		ex.doSomething();
		
		try {
			ex.demoSomething();
		}
		catch (Exception e) {
			System.out.println("Catch block");
		}

		System.out.println("About to exit");
		
		System.out.println(10 + 20);
		
	}
	
}
