package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamDemo implements AutoCloseable {
	
	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		System.err.println("hello");
		Scanner sc = new Scanner(new FileReader("employee.txt"));
		String line = sc.nextLine();
		System.out.println(line);
		//		InputStreamReader reader;
		//		try (InputStreamReader reader = new InputStreamReader(null, "employee.txt")) {
		//		}
		//		catch (UnsupportedEncodingException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		catch (IOException e1) {
		//			// TODO Auto-generated catch block
		//			e1.printStackTrace();
		//		}
		
		FileInputStream fi = new FileInputStream("/home/ubuntu/Desktop/cbimage.png");
		FileOutputStream os = new FileOutputStream("/home/ubuntu/Desktop/cbimage-copy.png");
		
		
		int val = fi.read();
		while (val != -1) {
			System.out.println((char) val);
			os.write(val);
			os.flush();
			val = fi.read();
		}
		
	}
	
	@Override
	public void close() throws Exception {
		this.close();
	}
	
}
