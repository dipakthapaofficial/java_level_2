package com.files;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterDemo {
	
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		try {
			//			BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("helloAgain.txt", true));
			//			
			//			String line = br.readLine();
			//			
			//			while (line != null) {
			//				bw.write(line);
			//				line = br.readLine();
			//			}
			
			
			for (int i = 0; i < 1; i++) {
				System.out.println("Enter you name::");
				String name = sc.next();
				//				bw.write(name + ", ");
				//				bw.flush();
				
				System.out.println("Enter you age::");
				String age = sc.next();
				//				bw.write(age + ", ");
				//				bw.flush();
				
				System.out.println("Enter you gender::");
				String gender = sc.next();
				//				bw.write(gender + ", ");
				//				bw.write("\n");
				
				Employee emp = new Employee();
				emp.name = name;
				emp.age = age;
				emp.gender = gender;
				//				
				System.out.println(emp);
				
				bw.write(emp.toString());
				bw.write("\n");
				bw.flush();
			}
			
			

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		finally {
		//			try {
		//				reader.close();
		//			}
		//			catch (IOException e) {
		//				// TODO Auto-generated catch block
		//				e.printStackTrace();
		//			}
		//		}
		
	}
	
}
