package com.codeinteracts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
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
		Integer[] nums = {1,4,5,6,2,3,9,8,3, 10};
		
		Stream<Integer> s = Arrays.stream(nums);
		s.filter(i -> i % 5 == 0).collect(Collectors.toList());
		
//		s.collect(Collectors.toSet());
		
//		s.distinct().collect(Collectors.toList());
 		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(nums));
		
		
		numbers.stream().forEach(n -> System.out.println(n));
		
		
		System.out.println("Count::"+numbers.stream().filter(num -> num % 2 == 0  ).count());
		
		
		System.out.println("Maximum::"+numbers.stream().mapToInt(Integer::valueOf).max().getAsInt());
		
		System.out.println("Minimum::"+numbers.stream().min(Integer:: compareTo).get());
//		val.get();
		
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
		
		stream = stream.filter(StreamDemo2 :: checkEven);
		
		List<Integer> filtered = stream.collect(Collectors.toList());
		
		
		System.out.println(filtered);
		
		System.out.println(numbers);
		
		
		List<Integer> numbers1 = numbers.stream().map(num -> num * 10).collect(Collectors.toList());
		System.out.println(numbers1);
		
		Predicate<Integer> pred = (Integer num) -> num % 2 == 0;
		//Stream api in single line
		List<Integer> filtered123 = numbers.stream().filter(pred).filter( num -> num % 5 == 0).collect(Collectors.toList());
		
		
		//Stream api in single line
		List<Integer> filtered1 = numbers.stream().filter(num -> num % 2 == 0).filter( num -> num % 5 == 0).collect(Collectors.toList());
		List<Integer> filtered2 = numbers.stream().filter(num -> num % 2 != 0).filter( num -> num % 5 == 0).collect(Collectors.toList());
		
		System.out.println(filtered1);
		
//		numbers = numbers.stream().peek(num -> System.out.println(num)).sorted((num1, num2) -> num2.compareTo(num1)).collect(Collectors.toList());
//		System.out.println(numbers);
//		
//		System.out.println("min=="+numbers.stream().min(Integer::compare).get());
		
		
	}

}
