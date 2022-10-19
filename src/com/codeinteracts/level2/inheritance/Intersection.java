package com.codeinteracts.level2.inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
	
	public int[] computeIntersection(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		//Compute intersection
		
		return result;
	}
	
	public int[] computeIntersection(int[] array1, int[] array2, int[] array3) {
		int[] result = new int[array1.length + array2.length];
		//Compute intersection
		
		return result;
	}
	
	public int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter number");
			int number = sc.nextInt();
			array[i] = number;
		}
		//INput array data
		
		return array;
	}
	
	public static void main(String[] args) {
		Intersection inter = new Intersection();
		
		int[] array1 = inter.inputArray();
		
		int[] array2 = inter.inputArray();
		int[] array3 = inter.inputArray();
		
		int[] result = inter.computeIntersection(array1, array2);
		//		int[] result = inter.computeIntersection(array1, array2, array3);
		
		System.out.println(Arrays.toString(result));
		
	}
	
}
