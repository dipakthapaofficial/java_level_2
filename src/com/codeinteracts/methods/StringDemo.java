package com.codeinteracts.methods;


public class StringDemo {
	
	public static void main(String[] args) {
		StringDemo demo = new StringDemo();
		String abc = new String("asdasdasd");
		
		//abc -> stack
		
		abc = "dipak" + " " + " thapa" + " is " + " a" + " boy";
		
		StringBuilder builder = new StringBuilder();
		builder.append("dipak");
		builder.append(" ");
		builder.append(" thapa");
		builder.append(" is");
		
		System.out.println(builder);
		

	}
	
}
