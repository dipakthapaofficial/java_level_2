package com.files;

import java.io.File;
import java.io.IOException;

public class MainClass {
	
	public static void main(String[] args) {
		FileReaderRevision frd = new FileReaderRevision();
		File file = new File("/home/ubuntu/Desktop/hello_something/hello0");
		
		try {
			frd.readFile(file);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program about to exit");
	}
	
}
