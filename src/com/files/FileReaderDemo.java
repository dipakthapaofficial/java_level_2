package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		FileReader reader = null;
		FileWriter writer = null;
		
		//		Reader reader = null;
		InputStreamReader red;
		
		try (FileReader reader = new FileReader("hello.txt")) {
			writer = new FileWriter("helloAgain123.txt");
			
			int value = reader.read();
			//			char[] c = new char[100];
			//			
			//			reader.read(c);
			//			System.out.println(Arrays.toString(c));
			
			while (value != -1) {
				System.out.println((char) value);
				writer.write(value);
				writer.flush();
				value = reader.read();
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
