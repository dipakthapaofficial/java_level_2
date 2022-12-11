package com.codeinteracts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	String name;
	Integer age;

	public Emp(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	
}


public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Emp> emps = new ArrayList<Emp>();

		emps.add(new Emp("hari", 10));
		emps.add(new Emp("shyam", 20));
		emps.add(new Emp("geeta", 30));
		emps.add(new Emp("hari2", 40));

		ArrayList<Emp> filtered = new ArrayList<Emp>();
		for(Emp em: emps) {
			System.out.println(em);
			if (em.age >=20 && em.age <= 30) {
				filtered.add(em);
			}
			
//			em.age += 10;
			
		}
		
		emps.stream().forEach(em -> System.out.println(em) );
		
		
		List<Emp> filt = emps.stream().filter(em -> em.age >=20 && em.age <= 30 ).collect(Collectors.toList());
		System.out.println(filt);
		
		List<String> names = emps.stream().map(em -> em.name).toList();
		System.out.println(names);
		
//		filt = filt.stream().filter(em -> em.age >=20 && em.age <= 30 ).map(em -> em.age += 10).collect(Collectors.toList());
		
		
		
		
	}

}
