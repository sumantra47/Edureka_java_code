package assignment;

import java.sql.SQLException;

public interface StudentDao {
	void create(Student student) throws SQLException;
	void update_mark(String studentId, float studentMarks) throws SQLException;
	void delete(String studentID) throws SQLException;
	void getAll()throws SQLException;
	void getbyStudentId(String studentId)throws SQLException;

}
