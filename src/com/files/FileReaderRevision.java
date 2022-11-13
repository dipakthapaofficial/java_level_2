package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderRevision {
	
	void readFile(File file) throws IOException {
		FileReader reader = new FileReader(file);
		
		int value = reader.read();
		System.out.println((char) value);
		if (reader.markSupported()) {
			reader.mark(1);
		}
		char[] c = new char[5];
		reader.read(c);
		System.out.println(Arrays.toString(c));
		reader.reset();
		
		value = reader.read();
		
		//		reader.read(c, 5, 5);
		//		System.out.println(Arrays.toString(c));
		
		System.out.println((char) value);
	}
	
}
