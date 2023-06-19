package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = (Student) con.getBean("obj");
//		System.out.println(student);
//		System.out.println(student.hashCode());
//		System.out.println("***************");
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
		//In a singleton application hash code will be same, It means object is created one time & we get reference
		//of that object from next time onwards for other use.
		Student student2 = (Student) con.getBean("obj");
//		System.out.println(student2.hashCode());
		System.out.println("***************************");
		
		Teacher t1 = con.getBean("teacher",Teacher.class);
		Teacher t2 = con.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
