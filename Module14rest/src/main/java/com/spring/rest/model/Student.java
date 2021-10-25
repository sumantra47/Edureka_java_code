package com.spring.rest.model;

public class Student {
	
	int std_id;
	String std_name;
	int std_class;
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public int getStd_class() {
		return std_class;
	}
	public void setStd_class(int std_class) {
		this.std_class = std_class;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_class=" + std_class + "]";
	}
	public Student(int std_id, String std_name, int std_class) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_class = std_class;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

}
