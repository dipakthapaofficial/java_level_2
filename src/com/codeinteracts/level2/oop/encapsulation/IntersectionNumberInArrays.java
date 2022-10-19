package com.codeinteracts.level2.oop.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionNumberInArrays {
	
	public int[] intersection(int[] array1, int[] array2) {
		int[] result = new int[array1.length > array2.length ? array2.length : array1.length];
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					result[count] = array1[i];
					count++;
				} else {
					continue;
				}
			}
		}
		
		return result;
	}
	
	public int[] intersection(int[] array1, int[] array2, int[] array3) {
		int size;
		if (array1.length < array2.length && array1.length < array3.length) {
			size = array1.length;
		} else if (array2.length < array1.length && array2.length < array3.length) {
			size = array2.length;
		} else {
			size = array3.length;
		}
		int[] result = new int[size];
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				for (int k = 0; j < array3.length; k++) {
					if (array1[i] == array2[j] && array3[k] == array1[i]) {
						result[count] = array1[i];
						count++;
					} else {
						continue;
					}
				}
			}
		}
		
		return result;
	}
	
	public int[] inputArray() {
		System.out.println("Enter size of array");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter number");
			int number = scan.nextInt();
			array[i] = number;
		}
		
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	public static void main(String[] args) {
		IntersectionNumberInArrays inter = new IntersectionNumberInArrays();
		int[] array1 = inter.inputArray();
		int[] array2 = inter.inputArray();
		
		int[] result = inter.intersection(array1, array2);
		System.out.println(Arrays.toString(result));
		
		int[] array3 = inter.inputArray();
		
		result = inter.intersection(array1, array2, array3);
		
		System.out.println(Arrays.toString(result));
		
	}
	
}
