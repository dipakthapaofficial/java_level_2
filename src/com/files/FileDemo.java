package com.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		System.out.println();
		File file = null;
		
		//		if (System.getProperty("os.name").equals("Linux")) {
		//			file = new File("/home/ubuntu/Desktop/some-directory");
		//		} else if (System.getProperty("os.name").equals("Windows")) {
		//			file = new File("C:\\Users\\some-directory");
		//		}
		file = new File("some-directory");
		System.out.println(file.length());
		file.setReadOnly();
		
		
		File file2 = new File(file, "hello-world1.txt");
		
		try {
			file2.createNewFile();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//		String[] fileNames = file.list();
		//		
		//		for (String s : fileNames) {
		//			System.out.println(s);
		//		}
		
		File[] files = file.listFiles();
		
		file.isDirectory();
		file.isFile();
		
//		boolean result = file.exists();
//		System.out.println(result);
		
		//		try {
			//			file.createNewFile();
			file.mkdir();
			//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(file.exists());
		
		//		file.delete();
		
	}
	
}
