package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	private static Connection connection;
	
	public static Connection getConnection() {
		if(connection ==null) {
			try {
				//connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "devuser", "pwd");
				connection =DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "password");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
