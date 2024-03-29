package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Student student) {
		//Insert query
        String query = "insert into student(id,name,city) values(?,?,?)";
        int res = this.jdbcTemplate.update( query,student.getId(),student.getName(),student.getCity() );
		return res;
	}
	
	//update query
	public int change(Student student) {
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	
	//delete query
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query,studentId); 
		return res;
	}
	
	public Student getStudent(int studentId) {
		// select single student data
		String query = "select * from student where id=?";
		//RowMapper<Student> rowMapper = new RowMapperImpl();
		
		//Anonymous object's implementation concept can be applied in below line instead of making object of RowMapper class.

		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
		}, studentId);
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
