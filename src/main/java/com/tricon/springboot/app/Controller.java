package com.tricon.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Controller {
	
	@Autowired
	StudentDaoImpl s;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getStudents() {
		System.out.println("hello");
	 return	s.getStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public int addStudentss(@RequestBody Student st) {
		System.out.println("hello-post");
		return s.addStudents(st);
	}
}
