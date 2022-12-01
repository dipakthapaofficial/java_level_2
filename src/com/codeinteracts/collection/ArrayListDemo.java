package src.com.codeinteracts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
//		ArrayList<String> names = (ArrayList<String>) Collections.synchronizedCollection(new ArrayList<String>());
		
		//Order
		//Nullable
		//Thread safe
		
		names.add(null);
		
		String[] nam = new String[5];
		System.out.println(Arrays.toString(nam));
		
		System.out.println(names.size());
		names.add("Ramesh");
		System.out.println(names.size());
		
		
		Vector<String> vectors = new Vector<>(3);
		vectors.add("Hari1");
		vectors.add("Hari2");
		System.out.println(vectors);
		vectors.add("Hari3");
		System.out.println(vectors.capacity());
		vectors.add("Hari4");
		System.out.println(vectors);
		
		
		Stack<String> stack = new Stack<>();
		stack.push("Ram1");
		stack.push("Ram2");
		stack.push("Ram3");
		stack.push("Ram4");
		stack.push("Ram5");
		
		System.out.println(stack);
		
		String removed = stack.pop();
		System.out.println(stack);
		
		String value = stack.peek();
		System.out.println(value);
		
		System.out.println(stack.get(1));
		
		while(stack.size() > 2) {
			stack.pop();
		}
		
//		System.out.println(stack.peek());
		
		System.out.println(stack.search("Ram1"));
		
//		System.out.println(stack.size());
		
		
		
	}

}
