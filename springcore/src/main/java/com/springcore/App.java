package com.springcore;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student std1 = (Student) context.getBean("student1");
        Student std2 = (Student) context.getBean("student2");
//        std1.setStudentId(10);
//        System.out.println(std1.getStudentId());
        System.out.println(std1);
        System.out.println(std2);
    }
}
