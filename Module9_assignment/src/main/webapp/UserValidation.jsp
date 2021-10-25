
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login UserName and Password Validation</title>
</head>
<body>

	<%
	String uname = request.getParameter("userName");
	String password = request.getParameter("pwd");
	%>

	<%
	System.out.println("USERNAME :" + uname + "password  :" + password);
	Connection connection = null;
	ResultSet resultSet = null;
	try {
		//Step 1 - Load the driver
		Class.forName("oracle.jdbc.OracleDriver");
		// Step 2 - Create connection
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "devuser", "pwd");
		System.out.println("Connection Established");
		// Step 3 - Create statement object
		Statement statement = connection.createStatement();
		// Step 4 - execute statement - select
		resultSet = statement.executeQuery(
		"SELECT * FROM USER_PASS where USERID = '" + uname.toLowerCase() + "' and PASSWORD = '" + password + "'");

		if (!resultSet.next()) {
			PrintWriter out1 = response.getWriter();
			out1.print("<label style =\"color:red\">User name or Password is invalid</label>");
			request.getRequestDispatcher("Login.html").include(request, response);

		} else {
			out.print("Valid User :" + resultSet.getString("USERID"));

		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			// Step 4 - close the connection
			connection.close();
			if (resultSet != null)
		resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	%>


</body>
</html>