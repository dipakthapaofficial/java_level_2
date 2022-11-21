package com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCombination {
	
	public static void main(String[] args) {
		ArrayList<Integer> multiplesOf2 = new ArrayList<>();
		ArrayList<Integer> multiplesOf3 = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				multiplesOf2.add(i);
			}
			
			if (i % 3 == 0) {
				multiplesOf3.add(i);
			}
		}
		
		System.out.println(multiplesOf2);
		
		System.out.println(multiplesOf3);
		
		multiplesOf2.addAll(multiplesOf3);
		
		System.out.println(multiplesOf2);
		
		multiplesOf2.sort(Comparator.naturalOrder());
		System.out.println(multiplesOf2);
		
		multiplesOf2.sort(Comparator.reverseOrder());
		System.out.println(multiplesOf2);
		
		Collections.sort(multiplesOf2);
		System.out.println(multiplesOf2);
		
	}
	
}
