package com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListReplace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 1, 1, 1, 9 };
		List<Integer> numbers = new ArrayList<>(Arrays.asList(nums));
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("two");
		list.add(3f);
		list.add("Four");
		
		list.set(0, "One");
		
		System.out.println(Collections.max(list));
		
		System.out.println(list);
 		
		//		numbers.add(1);
		//		numbers.add(2);
		//		numbers.add(4);
		//		numbers.add(1);
		//		numbers.add(1);
		
		System.out.println(numbers);
		

		//		int numberToRemove = 1;
		//		
		//		while (numbers.contains(numberToRemove)) {
		//			int index = numbers.indexOf(numberToRemove);
		//			numbers.remove(index);
		//		}
		//		System.out.println(numbers);
		
		Set<Integer> set = new HashSet<>();
		set.addAll(numbers);
		

		System.out.println(set);
		
	}
	
}
