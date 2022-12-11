package com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class ComparatorDemo implements Comparator<StudentDemo> {
	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {
		return o1.id < o2.id ? -1 : 1;
	}
}

class StudentDemo implements Comparable<StudentDemo>{
	String name;
	
	Integer id;

	public StudentDemo(String name, Integer i) {
		super();
		this.name = name;
		this.id = i;
	}

	@Override
	public int compareTo(StudentDemo demo) {
//		System.out.println(this.id);
//		System.out.println(demo.id);
//		if (this.id < demo.id) {
//			return 1;
//		}
//		return -1;
		
		return demo.id.compareTo(this.id);
		
//		return this.name.compareTo(demo.name);
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	void sort() {
		int[] a = new int[5];
		
		for(int i=0; i< a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if (a[i] > a[j]) {
					
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					
					
				}
			}
		}
		
	}
	
}

public class SortDemo {
	
	
	public static void main(String[] args) {
//		Comparable, Comparator
		
		List<StudentDemo> stuList = new ArrayList<>();
		
		StudentDemo st1 = new StudentDemo("Ramesh", 1);
		StudentDemo st2 = new StudentDemo("Ramesh", 2);
		
		System.out.println(st1.compareTo(st2));
		
		stuList.add(new StudentDemo("Ramesh1", 1));
		stuList.add(new StudentDemo("Ramesh4", 4));
		stuList.add(new StudentDemo("Ramesh5", 5));
		stuList.add(new StudentDemo("Ramesh10", 10));
		stuList.add(new StudentDemo("Ramesh11", 11));
		stuList.add(new StudentDemo("Ramesh12", 12));
		stuList.add(new StudentDemo("Ramesh3", 3));
		
		System.out.println(stuList);
		
//		Collections.sort(stuList);
		
		//Using comparable, sorting to descending order
		System.out.println("Using comparable, sorting to descending order");
		Collections.sort(stuList);
		System.out.println(stuList);
		
		//Using comparator, sorting to ascending order
		System.out.println("Using comparator, sorting to ascending order");
		ComparatorDemo dem = new ComparatorDemo();
		Collections.sort(stuList, dem);
		
		Collections.sort(stuList, new Comparator<StudentDemo>() {

			@Override
			public int compare(StudentDemo o1, StudentDemo o2) {
				return o1.id < o2.id ? -1 : 1;
			}
			
			//Inner class
		});
		
		
		Collections.sort(stuList, new Comparator<StudentDemo>() {

			@Override
			public int compare(StudentDemo o1, StudentDemo o2) {
				return o1.id > o2.id ? -1 : 1;
			}
			
		});
		
		System.out.println(stuList);
		
		String[] n = {"Ramesh", "Hari", "Shyam", "Dipak"};
		List<String> names = Arrays.asList(n);
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		
		List<Integer> numbers1 = new ArrayList<>();
		
		System.out.println(numbers1.getClass());
		System.out.println(numbers1.getClass().getPackageName());
		
		
		Object obj = numbers1;
		
		obj = new Integer(1);
		
		System.out.println(obj.getClass());
		
		
		
		
		
		

	}

}
