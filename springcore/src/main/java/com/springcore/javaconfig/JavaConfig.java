package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	//@Bean( name= {"student","temp","obj"}) =>Array: change id of Student class
	@Bean(name= {"student","temp","obj"})
	public Student getStudent() {
		//creating a new object of student class
		Student student = new Student(getSamosa());
		// returning object of student class
		return student;
	}
}
