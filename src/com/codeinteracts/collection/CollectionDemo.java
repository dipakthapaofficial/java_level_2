package com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	
	//	int add(int a, int b) {
	//		return a + b;
	//	}
	//	
	//	String add(String a, String b) {
	//		return a + b;
	//	}
	//	
	//	float add(float a, float b) {
	//		return a + b;
	//	}
	
	public static void main(String[] args) {
		
		//		Collection<Integer> collection = new Collection<Integer>() {
		//			
		//			@Override
		//			public <T> T[] toArray(T[] a) {
		//				// TODO Auto-generated method stub
		//				return null;
		//			}
		//			
		//			@Override
		//			public Object[] toArray() {
		//				// TODO Auto-generated method stub
		//				return null;
		//			}
		//			
		//			@Override
		//			public int size() {
		//				// TODO Auto-generated method stub
		//				return 0;
		//			}
		//			
		//			@Override
		//			public boolean retainAll(Collection<?> c) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public boolean removeAll(Collection<?> c) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public boolean remove(Object o) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public Iterator<Integer> iterator() {
		//				// TODO Auto-generated method stub
		//				return null;
		//			}
		//			
		//			@Override
		//			public boolean isEmpty() {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public boolean containsAll(Collection<?> c) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public boolean contains(Object o) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public void clear() {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//			
		//			@Override
		//			public boolean addAll(Collection<? extends Integer> c) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//			
		//			@Override
		//			public boolean add(Integer e) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//		};
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		
		numbers.add(5, 10);
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		System.out.println(numbers.indexOf(6));
		
		ArrayList<Integer> numbers1 = new ArrayList<>();
		numbers1.add(1);
		numbers1.add(6);
		numbers1.add(5);
		
		System.out.println(numbers1.size());

		numbers.addAll(numbers1);
		
		System.out.println(numbers);
		
		System.out.println(numbers.size());
		
		int removedValue = numbers.remove(6);
		
		System.out.println(removedValue);
		
		System.out.println(numbers.size());
		
		System.out.println(numbers);
		
		List<Integer> sublist = numbers.subList(0, 2);
		
		System.out.println(sublist);
		
	}
	
}
