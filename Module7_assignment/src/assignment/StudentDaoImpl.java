package assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDaoImpl implements StudentDao {

	private Connection connection;
	private Statement st;

	public StudentDaoImpl() {
		connection = ConnectionFactory.getConnection();
		try {
			st = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void create(Student student) throws SQLException {
		//INSERT query
		System.out.println("insert into Student values('"
		+ student.getStudentId() + "','"
				+student.getStudentName()
				+ "',"+student.getStudentClass()+","+student.getStudentMark()+")");
		st.executeUpdate("insert into Student values('"
		+ student.getStudentId() + "','"
				+student.getStudentName()
				+ "',"+student.getStudentClass()+","+student.getStudentMark()+")");
		System.out.println("Record Inserted!");

	}

	@Override
	public void update_mark(String studentId, float studentMarks) throws SQLException {
		System.out.println("UPDATE STUDENT " + 
				"SET studentMark = " + studentMarks + 
				"WHERE studentId = " + studentId );
		st.executeUpdate("UPDATE STUDENT " + 
				"SET studentMark = " + studentMarks + 
				"WHERE studentId = " + studentId);
		System.out.println(" Record updated!");

	}

	@Override
	public void delete(String studentID) throws SQLException {
		st.executeUpdate("DELETE FROM STUDENT s WHERE studentId =" + studentID);
		System.out.println("Record deleted!");

	}

	@Override
	public void getAll() throws SQLException {
		ResultSet rs = st.executeQuery("select * from STUDENT");
		while(rs.next()) {
			System.out.println("Student Id : " + rs.getString(1));
			System.out.println("Student Name : " + rs.getString(2));
			System.out.println("Student Class : " + rs.getInt(3));
			System.out.println("Student Class : " + rs.getFloat(4));
			System.out.println("****************************");
		}
		rs.close();

	}

	@Override
	public void getbyStudentId(String studentId) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("select * from STUDENT where studentId = ?");
		statement.setString(1, studentId);
		ResultSet rs =  statement.executeQuery();
		while(rs.next()) {
			System.out.println("Student Id : " + rs.getString(1));
			System.out.println("Student Name : " + rs.getString(2));
			System.out.println("Student Class : " + rs.getInt(3));
			System.out.println("Student Class : " + rs.getFloat(4));
			System.out.println("****************************");
		}
		rs.close();

	}

}
