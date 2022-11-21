package com.codeinteracts.collection;

import java.util.ArrayList;

public class ListReplace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] nums = { 1, 2, 3, 4, 5, 6, 1, 1, 1, 9 };
		ArrayList<Integer> numbers = new ArrayList<>();
 		
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		numbers.add(1);
		
		System.out.println(numbers);
		
		int numberToRemove = 1;
		
		while (numbers.contains(numberToRemove)) {
			int index = numbers.indexOf(numberToRemove);
			numbers.remove(index);
		}
		System.out.println(numbers);
	}
	
}
