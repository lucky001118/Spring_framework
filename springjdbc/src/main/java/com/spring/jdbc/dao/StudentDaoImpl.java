package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		//insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	@Override
	public int change(Student student) {
		//update data query
		String query = "update student set name=?,city=? where id=?";
		int result=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	
	@Override
	public int delete(int studentId) {
		// delete operation query
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query,studentId);
		return result;
	}
	
	@Override
	public Student getStudent(int studentId) {
		// select the single student from the database
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// selecting multiple student
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImp()) ;
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
