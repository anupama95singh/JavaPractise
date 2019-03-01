package com.tricon.springboot.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Student> getStudents() {
		class CustomRowmapper implements RowMapper<Student>
		{
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				return s;
			}			
		}
		
		return jdbctemplate.query("SELECT * FROM students", new CustomRowmapper());		
	}
	
	@Override
	public int addStudents(Student s) {
		System.out.println("hdjfhdkjfhk");
		 return jdbctemplate.update("INSERT INTO students(id,name) VALUES(?, ?)", new Object[] {s.getId(), s.getName()});
	}
	@Override
	public void updateStudents(Student s) {
	
		
	}

	@Override
	public void deleteStudent(int id) {
	
		
	}

}
