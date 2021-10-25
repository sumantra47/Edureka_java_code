package com.spring.rest.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.rest.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
private static List<Student> studentrepo = new ArrayList<>();
	
	public void addStudent(Student s1) {
		studentrepo.add(s1);
		
	}
	
	public void deleteStudent(int id) {
		Iterator<Student> it = studentrepo.iterator();
		while(it.hasNext()) {
			Student stud= it.next();
			if(stud.getStd_id() == id) {
				it.remove();
			}
		}
	}
	
	public void updateStudentname(int id, String name ) {
		Iterator<Student> it = studentrepo.iterator();
		while(it.hasNext()) {
			Student stud= it.next();
			if(stud.getStd_id() == id) {
				stud.setStd_name(name);
				System.out.println(stud);
			}
		}
	}
	public Student getStudentbyId(int id) {
		for (Student stud : studentrepo) {
			if(stud.getStd_id() == id) {
				return stud;
		}
	}
		return null;
	}

	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		return studentrepo;
	}

}
