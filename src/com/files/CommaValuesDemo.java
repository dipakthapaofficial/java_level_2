package com.files;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class CommaValuesDemo {
	
	public static void main(String[] args) throws IOException {
		//		CSVWriter writer = new CSVWriter(new FileWriter("employee.csv", true));
		//		
		//		String[] values = { "1", "dipak", "thapa", "MALE", "ADMIN", "dipak", "dipak" };
		//		writer.writeNext(values);
		//		
		//		writer.close();
		
		CSVReader reader = new CSVReader(new FileReader("employee.csv"));

	}
	
}
