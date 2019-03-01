package com.tricon.springboot.app;

import java.util.List;

public interface StudentDao {
	
	public List<Student> getStudents();
	public int addStudents(Student s);
	public void updateStudents(Student s);
	public void deleteStudent(int id);
}
