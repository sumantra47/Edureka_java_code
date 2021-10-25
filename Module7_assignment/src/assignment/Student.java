package assignment;

public class Student {
	
	private String studentId;
	private String studentName;
	private int    studentClass;
	private float  studentMark;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	public float getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(float studentMark) {
		this.studentMark = studentMark;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentMark=" + studentMark + "]";
	}
	public Student(String studentId, String studentName, int studentClass, float studentMark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentMark = studentMark;
	}
	
	
}
