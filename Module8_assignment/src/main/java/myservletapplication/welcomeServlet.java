package myservletapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class welcomeServlet
 */
@WebServlet("/welcome")
public class welcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public welcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();// give print writer object
		String uname = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		out.println("<h2>Welcome </h2> ");
		out.println("<h3>Username :" + uname + "</h3> ");
		out.println("<h3>Password :" + pwd + "</h3> ");
		System.out.println("userid "+uname + "password " +pwd);
//		// Retrieval of cookies
//		Cookie[] cookies = request.getCookies();
//
//		System.out.println("coke :" + cookies.length);
//		for (Cookie cookietest : cookies) {
//			System.out.println("hi cook" + cookietest.getName() + " " + cookietest.getValue());
//		}
//
//		out.print("Getting user name value from cookie : " + cookies[0].getValue());
//		out.println("Getting password value from cookie : " + cookies[1].getValue());

		out.close();
	}

}
