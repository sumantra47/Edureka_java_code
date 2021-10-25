package myservletapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public loginServlet() {
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
		//String uname = request.getParameter("userName");
		System.out.println("Inside Login Service method");
		// Cookie implementation
		Cookie cookie1 = new Cookie("username", request.getParameter("userName"));
		cookie1.setMaxAge(24 * 60 * 60);
		Cookie cookie2 = new Cookie("password", request.getParameter("pwd"));
		cookie2.setMaxAge(24 * 60 * 60);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome");
		dispatcher.forward(request, response);
		out.close();
	}

}
