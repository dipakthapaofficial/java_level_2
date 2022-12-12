package com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	String name;

	public Emp(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}

}

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");

		ArrayList<Emp> emp = new ArrayList<Emp>();

		emp.add(new Emp("hari"));
		emp.add(new Emp("shyam"));
		emp.add(new Emp("geeta"));
		emp.add(new Emp("hari2"));

		System.out.println(emp);
		
		
		List<String> emp123 = emp.stream().map(employee -> employee.name.toUpperCase()).collect(Collectors.toList());
		System.out.println(emp123);

//		Iterator<Emp> iter = emp.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);

		List<Integer> filtered = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) {
			Integer value = numbers.get(i);
			if (value >= 10 && value <= 20) {
				filtered.add(value);
			}

		}

		for (int i = 0; i < emp.size(); i++) {
			Emp em = emp.get(i);

		}
		
		
		int[] array = {1,2,3,4,5,7};
		
		for(int i=0; i<array.length; i++) {
			
			int j = array[i];
			
			
		}
		
		
		TeacherMain[] array1;
		
//		for(TeacherMain j: array1) {
//			
//		}
		
		Iterator j = filtered.iterator();
		
		while(j.hasNext()) {
			Integer value = (Integer) j.next();
			
			
		}
		
		
		
		
		
//		filteredStudents // ArrayList
//
//		for (Emp em : emp) {
//			System.out.println(em);
//			
//			em.age >= 20 && em.age < =30
//					
//					filteredStudents.add(em)
//			
//		}
		
//		System.out.println(filteredStudents);
		
		List<Emp> emps = emp.stream().filter(e -> e.name.startsWith("h") || e.name.startsWith("g")).collect(Collectors.toList());
		System.out.println(emps);

	}

}
