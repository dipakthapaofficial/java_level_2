package com.codeinteracts.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Student  {
	String name;
	
	Integer id;

	public Student(String name, Integer i) {
		super();
		this.name = name;
		this.id = i;
	}

//	@Override
//	public int compareTo(Student o) {
//		if (this.id > o.id) {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> names = new HashSet<String>();

		names.add("Ramesh");
		names.add("Dipak");
		names.add("Ramesh");
		names.add("Geeta");
		names.add(null);

		System.out.println(names);

		names.remove(null);

		System.out.println(names);

		Set<String> treeSet = new TreeSet<String>();

		treeSet.add("Ramesh");
		treeSet.add("Dipak");
		treeSet.add("Ramesh");
		treeSet.add("Geeta");

		Set<Integer> numbers = new TreeSet<Integer>();

		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		System.out.println(numbers);

		// NUll is not allowed on treeset
//		treeSet.add(null);

		System.out.println(treeSet);
		
		Set<Student> students = new TreeSet<Student>();
		students.add(new Student("Ramesh", 1));
		students.add(new Student("Ramesh", 4));
		students.add(new Student("Ramesh", 5));
		students.add(new Student("Ramesh", 10));
		students.add(new Student("Ramesh", 11));
		students.add(new Student("Ramesh", 12));
		students.add(new Student("Ramesh", 3));
		
		List<Student> stuList = new ArrayList<>();
		
		
		System.out.println(students);
		

	}

}
