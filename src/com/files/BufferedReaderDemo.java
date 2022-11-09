package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) {
		
		Reader read = null;
		
		try (FileReader reader = new FileReader("hello.txt")) {
			//			writer = new FileWriter("src/helloAgain.txt");
			

			//			int value = reader.read();
			
			//			System.out.println(reader.ready());
			
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				//				br.skip(9);
				line = br.readLine();
			}
			
			//			char[] c = new char[100];
			//			
			//			reader.read(c);
			//			System.out.println(Arrays.toString(c));
			
			//			while (value != -1) {
			//				System.out.println((char) value);
			//				//				writer.write(value);
			//				System.out.println((char) value);
			//				reader.skip(10);
			//				value = reader.read();
			//			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
