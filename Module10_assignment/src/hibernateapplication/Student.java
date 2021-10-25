package hibernateapplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id@GeneratedValue
	@Column(name ="id")
	private int id;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Column(name ="name")
	private String name;
	
	@Column(name ="marks")
	private int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
