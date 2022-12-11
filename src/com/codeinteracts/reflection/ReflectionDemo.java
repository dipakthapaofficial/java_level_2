package com.codeinteracts.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student {
	
	String name;
	
	public Student(){
}	
	private void sayHello() {
		System.out.println("Inside say hello method");
		System.out.println("Hello world.");
	}
	
//	void doSomething(int a) {
//		System.out.println("Parameter::" +a);
//	}
//	
//	void doSomething(float a) {
//		System.out.println("Parameter::" +a);
//	}
//	
//	void doSomething(double a) {
//		System.out.println("Parameter::" +a);
//	}
//	
//	void doSomething(Student a) {
//		System.out.println("Parameter::"+a);
//	}
//	
	
	public void doSomething(Object a) {
		
		System.out.println("Parameter::"+a);
		System.out.println(a.getClass());
		System.out.println(a);
		
		if (a.getClass().getCanonicalName().equals("java.lang.Integer")) {
			Integer num = Integer.parseInt(a.toString());
			System.out.println(num);
		}
		
		if (a.getClass().getCanonicalName().equals("java.lang.String")) {
			String val = a.toString();
			System.out.println(val);
		}
		
	}
	
}

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		System.out.println(student.getClass());
		
		student.doSomething("student");
		
		student.doSomething(1);
		
//		student.sayHello();
		
		
		try {
			Class c = Class.forName("com.codeinteracts.reflection.Student");
			System.out.println(c.isInterface());
			
			Method[] methods = c.getMethods();
			
			
			
			Constructor c1 = c.getConstructor();
			
			System.out.println(c1.getName());
			
			Constructor[] cons = c.getConstructors();
			
			for(Constructor c2: cons) {
				System.out.println("Inside cons");
				System.out.println(c2.getName());
			}
			
			Student s = (Student) c.newInstance();
			
			for(Method method: methods) {
//				System.out.println(method.getName());
				
				
				if (method.getName().equals("sayHello")) {
					System.out.println("about to invoke say hello using reflection");
//					method.invoke(new Student(), null);
					
					method.invoke(s, null);
					
				}
			}
			
			
			
			//Making a private method accessible via reflection
			Method method = c.getDeclaredMethod("sayHello", null);
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			Class[] param = method.getParameterTypes();
			
			System.out.println(method.getReturnType());
			
			System.out.println(method.isAccessible());
			method.setAccessible(true);
			
//			method.invoke(new Student(), null);
			
			method.invoke(s, null);
			
			
			//Making all the fields accessible via reflection
			Field[] fields = c.getDeclaredFields();
			for(Field field: fields) {
				field.setAccessible(true);
				
			}
			
			
			
			
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
