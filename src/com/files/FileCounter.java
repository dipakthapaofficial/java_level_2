package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
	
	public static void main(String[] args) {
		File file = new File("some-directory/hello.txt");
		
		int alphabetCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int specialCharCount = 0;
		
		
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			
			int value = reader.read();
			while (value != -1) {
				
				if (Character.isAlphabetic(value)) {
					alphabetCount++;
				} else if (Character.isSpace((char) value)) {
					spaceCount++;
				} else if (Character.isDigit((char) value)) {
					digitCount++;
				} else {
					specialCharCount++;
				}
				
				value = reader.read();
			}
			
			System.out.println("Alphabet count::" + alphabetCount);
			System.out.println("spaceCount ::" + spaceCount);
			System.out.println("specialCharCount::" + specialCharCount);
			System.out.println("digitCount::" + digitCount);
			
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
