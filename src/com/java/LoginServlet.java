package com.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

	/**
	 * Serialized Version ID - Required to extend HttpServlet
	 */
	private static final long serialVersionUID = 4315535088220590121L;

	public LoginServlet() {
		System.out.println("LoginServlet Initialized.");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init method");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method");
		RequestDispatcher reqD = req.getRequestDispatcher("html/login.html");
		reqD.forward(req, resp);
	}

	
	@Override
	public void destroy() {
		System.out.println("Destroy method.");
	}

}
