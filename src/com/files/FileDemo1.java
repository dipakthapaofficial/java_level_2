package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {
	
	public static void main(String[] args) {
		System.out.println();
		File f1 = null;
		
		f1 = new File("some-directory");
		f1.setWritable(true);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter file name::");
			String fileName = sc.nextLine();
			
			File f2 = new File(f1, fileName);
			try {
				f2.createNewFile();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sc.close();
		
	}
	
}
