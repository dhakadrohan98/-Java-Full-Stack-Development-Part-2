package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program is started......." );
        //spring Jdbc=> jdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        //Now we will make object of student class to insert id,name,city into student object class.
        Student student = new Student();
        student.setId(7);
        student.setName("Ritesh Rana");
        student.setCity("Gurgaon");
        
        int result = studentDao.insert(student);
        
        System.out.println("student added: " +result);
        
//        In simpler terms, the error suggests that the code you're running couldn't connect to the MySQL database due to a communication issue. This could be caused by various factors, such as incorrect database connection settings (e.g., wrong hostname, port, username, or password), network connectivity problems, or the MySQL server being offline or unreachable.
    }
}
