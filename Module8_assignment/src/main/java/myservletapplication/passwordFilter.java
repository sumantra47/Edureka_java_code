package myservletapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class passwordFilter
 */
@WebFilter("/login")
public class passwordFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public passwordFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Inside Password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();// give print writer object
		String pwd = request.getParameter("pwd");
		String uname = request.getParameter("userName");
		if (pwd.length() >= 8 && uname.equals(uname)) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		} else {
			out.print("<label style =\"color:red\">User name or Password is invalid</label>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
			System.out.println("Inside else method");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
