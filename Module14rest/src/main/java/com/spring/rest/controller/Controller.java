package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dao.StudentDao;
import com.spring.rest.model.Student;



@RestController
public class Controller {
	
	@Autowired
	StudentDao studentDao;
	
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addstudentCard(@RequestBody Student student) {
		studentDao.addStudent(student);
		System.out.println("Add Success !!");
	}
	
	@RequestMapping(value = "/update/{id}/{name}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public void updatestudentname(@PathVariable int id, @PathVariable String name) {
		studentDao.updateStudentname(id,name);
		System.out.println("Update Success !!");
	}
	
	@RequestMapping(value = "/getstudent/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public Student getstudentbyid(@PathVariable int id) {
		Student s1 = studentDao.getStudentbyId(id);
		System.out.println("Get Success !!");
		return s1;
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public List<Student> getallStudent() {
		List<Student> list = studentDao.getallStudent();
		System.out.println("Get All Success !!");
		return list;
	}
	
	@RequestMapping(value = "/deletestudent/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public void deletestudent(@PathVariable int id) {
		studentDao.deleteStudent(id);
		System.out.println("Delete Success !!");
		
	}
	
	@RequestMapping(value = "/student/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public String testconnect() {
		return "Hello World";
	}

}
