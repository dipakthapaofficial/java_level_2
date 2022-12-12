package com.codeinteracts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
	
	
	static boolean checkEven(Integer number) {
		System.out.println("Inside stream api call");
		System.out.println(number);
		
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Integer[] nums = {1,4,5,6,2,3,9,8,10};
 		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(nums));
		
		List<Integer> oddNumbers = new ArrayList<>();
		for(Integer num: numbers) {
			if (num % 2 != 0) {
				oddNumbers.add(num);
			}
		}
		
		System.out.println(oddNumbers);
		
		//Filter via stream API
		Stream<Integer> stream = numbers.stream();
		
		stream = stream.filter(i -> checkEven(i));
		
		List<Integer> filtered = stream.collect(Collectors.toList());
		
		
		System.out.println(filtered);
		
		
		//Stream api in single line
		List<Integer> filtered1 = numbers.stream().filter(num -> num % 2 == 0).filter( num -> num % 5 == 0).collect(Collectors.toList());
		List<Integer> filtered2 = numbers.stream().filter(num -> num % 2 != 0).filter( num -> num % 5 == 0).collect(Collectors.toList());
		
		System.out.println(filtered1);
		
		
	}

}
