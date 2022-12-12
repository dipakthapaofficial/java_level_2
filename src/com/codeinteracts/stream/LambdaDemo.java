package com.codeinteracts.stream;


interface LambdaDemoInterface {
	
	String sayHello(String name);
	
}

interface LambdaInterface {
	
	void sayHello();
	
//	void greet();
	
}


class LambdaImpl implements LambdaInterface {

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	
}


class LambdaImpl1 implements LambdaInterface {

	@Override
	public void sayHello() {
		System.out.println("GoodBye");
		
	}
	
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		
//		LambdaInterface l1 = new LambdaInterface() {
//			
//			@Override
//			public void sayHello() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void greet() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		LambdaInterface li = () -> {
			System.out.println("Hello world");
			System.out.println("Hello again");
		};
		
		LambdaInterface li1 = () -> System.out.println("GoodBye");
		
		li.sayHello();
		
		li1.sayHello();
		
		
		
		LambdaDemoInterface ldi = (String name) -> {
			return "Hello " + name;
		};
		
		String message = ldi.sayHello("dipak");
		System.out.println(message);
		
		
		
		
//		LambdaInterface l10 = new LambdaImpl();
//		l10.sayHello();
//		
//		LambdaInterface l11 = new LambdaImpl1();
//		l11.sayHello();
	}

}
