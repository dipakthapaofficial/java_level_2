package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	
	public void readFile(File file) throws IOException {
		//		FileReader reader = new FileReader("some-directory/hello.txt");
		
		FileReader reader = new FileReader(file);
		
		//		char[] c = new char[100];
		//		reader.read(c);
		//		
		//		System.out.println(Arrays.toString(c));
		
		//		System.out.println(val);
		//		System.out.println((char) val);
		
		int value = reader.read();
		
		while (value != -1) {
			
			System.out.println((char) value);
			
			value = reader.read();
		}
		
		reader.close();
		
	}
	
	public static void main(String[] args) {
		File file = new File("some-directory/hello123.txt");
		

		FileReadDemo demo = new FileReadDemo();
		try {
			
			if (file.exists()) {
				demo.readFile(file);
			} else {
				System.out.println("NO file to read.");
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(file.getName() + " File not found");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("IO exception.....");
			e.printStackTrace();
		}
		
	}
	
}
