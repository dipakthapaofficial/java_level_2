package com.codeinteracts.collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;


class Node {
	Integer prev;
	Integer next;
	Integer val;
	@Override
	public String toString() {
		return "Node [prev=" + prev + ", next=" + next + ", val=" + val + "]";
	}
	
}

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] nums = {1,2,3,4,5,6};
		
		
		LinkedList<Integer> numbers = new LinkedList<Integer>(Arrays.asList(nums));
		
		System.out.println(numbers);
		
		numbers.addFirst(0);
		numbers.addLast(10);
		
		System.out.println(numbers);
		
		numbers.pollFirst();
		System.out.println(numbers);
		
		numbers.pollLast();
		System.out.println(numbers);
		
		numbers.addFirst(null);
		
		
		LinkedList<Node> nodes = new LinkedList<Node>();
		Node nod1 = new Node();
		nod1.prev = null;
		nod1.val = 10;
		nod1.next = null;
		
		
		nodes.add(nod1);
		
		Node nod2 = new Node();
		nod2.prev = 10;
		nod2.val = 20;
		nod2.next = null;
		
		nod1.next = 20;
		
		
		nodes.add(nod2);
		
		System.out.println(nodes);
		
		
		ArrayDeque<Integer> numbers1 = new ArrayDeque<Integer>();
		numbers1.addFirst(10);
		numbers1.addLast(20);
		
		System.out.println(numbers1);
		
	}

}
