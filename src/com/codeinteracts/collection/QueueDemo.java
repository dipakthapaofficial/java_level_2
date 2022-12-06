package com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import com.codeinteracts.ems.Employee;

public class QueueDemo {

	public QueueDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Integer[] a = {-1,0,10,5};
		
//		Integer[] a = new Integer[5];
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		System.out.println(queue);
		
		queue.add(1);
		queue.add(5);
		queue.add(4);
		queue.add(10);
		
		System.out.println(queue);
		
		
		for(Integer element: queue) {
			System.out.println("Element:: "+element);
		}
		
		Iterator iter = queue.iterator();
		
		Set<Integer> set = new HashSet<>(Arrays.asList(a));
		
		Iterator setIterator = set.iterator();
		
		
		ListIterator iter1 = new ArrayList<>(queue).listIterator();
		

		while(iter1.hasNext()) {
			System.out.println("element:: "+iter.next());
//			System.out.println("previous element:: "+iter1.previous());
		
		}
		
		
		System.out.println("head:"+queue.peek());
		
		queue.offer(34);
		
		queue.remove();
		
		System.out.println(queue);
		
		queue.add(11);
		
		System.out.println(queue);
		
		queue.remove(5);
		
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
		
		int removedHead = queue.poll();
		System.out.println("Removed::"+removedHead);
		
		System.out.println(queue);
//		
//		List<Integer> nums = new ArrayList<>(queue);
//		
//		
//		Collections.sort(nums, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		});
		
		
		

	}

}
