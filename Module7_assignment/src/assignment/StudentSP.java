package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StudentSP {

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		String sql = "{call upd_marks(?, ?)}";
		CallableStatement st;
		try {
			st = connection.prepareCall(sql);
			st.setString(1, "S002");
			st.registerOutParameter(2, Types.FLOAT);
			st.execute();
			System.out.println("Updated Marks : " + st.getFloat(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
