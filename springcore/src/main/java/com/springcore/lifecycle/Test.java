package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Pizza p = (Pizza)context.getBean("p1");
		System.out.println(p);
		//registerShutdownHook()-> method will call destroy() method on their own & this method is available in AbstractApplicationContext class
		//Registering shutdown hook
		context.registerShutdownHook();
	}

}
