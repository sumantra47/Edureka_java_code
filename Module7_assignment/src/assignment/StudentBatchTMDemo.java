package assignment;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentBatchTMDemo {

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		try {
			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.addBatch("insert into Student values('S001','',2,98.0)");
			statement.addBatch("insert into Student values('S003','Ravi',2,55.0)");
			statement.addBatch("insert into Student values('S004','Kishore',5,65.0)");
			statement.addBatch("insert into Student values('S005','Anish',7,83.0)");
			statement.addBatch("insert into Student values('S006','Ritu',6,65.0)");
			statement.addBatch("insert into Student values('S007','Anita',9,95.0)");
			statement.addBatch("UPDATE STUDENT SET STUDENTMARK =	90.56 WHERE STUDENTID = 'S005'");
			statement.addBatch("DELETE from STUDENT where STUDENTID=");
			statement.executeBatch();
			connection.commit();
			System.out.println("Success!");
		} catch (SQLException e) {
			try {
				System.out.println("Inside catch batch");
				connection.rollback();
				System.out.println("Rollbacked successfully!");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		}

	}

}
