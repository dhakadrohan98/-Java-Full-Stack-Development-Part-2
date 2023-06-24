package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Student student) {
		//Insert query
        String query = "insert into student(id,name,city) values(?,?,?)";
        int res = this.jdbcTemplate.update( query,student.getId(),student.getName(),student.getCity() );
		return res;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
