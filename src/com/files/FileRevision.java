package com.files;

import java.io.File;
import java.io.IOException;

public class FileRevision {
	
	File createFolder() throws IOException {
		File folder = null;
		File fil1 = new File("/home/ubuntu/Desktop/hello_something");
		try {
			fil1.createNewFile();
			folder = new File("/home/ubuntu/Desktop/hello_something");
			
			
		}
		catch (IOException e) {
			System.out.println("Inside catch");
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return folder;
	}
	
	void createFileInsideFolder(File folder, String fileName) {
		File textFile = new File(folder, fileName);
		try {
			textFile.createNewFile();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	int countFiles(File folder) {
		File[] files = folder.listFiles();
		//		int count = 0;
		//		for (File file : files) {
		//			count += 1;
		//		}
		//		return count;
		return files.length;
	}
	
	public static void main(String[] args) {
		//		File file = new File("/home/ubuntu/Desktop/hello_something");
		//		file.mkdir();
		
		FileRevision fr = new FileRevision();
		try {
			File folder = fr.createFolder();
			
			for (int i = 0; i < 5; i++) {
				fr.createFileInsideFolder(folder, "hello" + i);
			}
			
			System.out.println("Total number of files==" + fr.countFiles(folder));

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		

		System.out.println("Ran successfully.");
		
		//		System.out.println(file.exists());
		//		System.out.println(file.getAbsolutePath());
		//		System.out.println(file.getPath());
		
	}
	
}
