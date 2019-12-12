package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		int num = (int) session.getAttribute("sum");
		int result = num * num;
		PrintWriter out = res.getWriter();
		out.println("Result is: " + result);
		
		session.removeAttribute("sum"); // We can remove attribute and after that we can't fetch the value
		out.println((int) session.getAttribute("sum")); //will through NullPointerException
	}
}
