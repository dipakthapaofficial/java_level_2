package new_package;

import com.codeinteracts.level2.oop.encapsulation.Student;
import com.codeinteracts.methods.MethodDemo;
import com.codeinteracts.methods.MethodDemo2;

public class MainClass1 {
	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		
		MethodDemo2 md2 = new MethodDemo2();
		
		Student student1 = new Student();
		student1.contactNumber = "988798988988";
		student1.firstName = "John";
		student1.lastName = "Doe";
		student1.gender = "male";
		student1.age = "20";
		//		student1.id = "1";
		//		student1.password = "password";
		
		Student student2 = new Student();
		student2.firstName = "Jane";
		student2.lastName = "Doe";
		student2.age = "20";
		student2.gender = "female";
		//		student2.id = "2";
		//		student2.password = "password";
		
		student1.printName();
		student2.printName();
	}
	
}
