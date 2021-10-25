package com.spring.rest.dao;

import java.util.List;

import com.spring.rest.model.Student;

public interface StudentDao {
	
	public void addStudent(Student s1);
	public void deleteStudent(int id);
	public void updateStudentname(int id, String name );
	public Student getStudentbyId(int id);
	public List<Student> getallStudent();
	//public List<Student> getallStudent();
}
