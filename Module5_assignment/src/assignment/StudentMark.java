package assignment;

public class StudentMark {
	
	private String studentID;
	private String studentName;
	private int studentMark;
	
	
	public StudentMark(String studentID, String studentName, int studentMark) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentMark = studentMark;
	}
	
	
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}
	

}
