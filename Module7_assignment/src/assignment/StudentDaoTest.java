package assignment;

import java.sql.SQLException;

public class StudentDaoTest {

	public static void main(String[] args) throws SQLException {
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		Student s1 = new Student("S001","Arunima",2,90.5f);
		Student s2 = new Student("S002","Sumantra",4,89.5f);
	
		daoImpl.create(s1);
		daoImpl.getbyStudentId("S002");
		daoImpl.update_mark("'S002'", 30.56f);
		daoImpl.delete("'S001'");
		daoImpl.getAll();
		
		//daoImpl.delete(10);
	//	daoImpl.getItemByItemId(1000002);
	//	daoImpl.getAll();
		ConnectionFactory.getConnection().close();
		
	}

}
