package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletContext scontext = getServletContext();
		String name = scontext.getInitParameter("name"); // Get values from web.xml file
		String phone = scontext.getInitParameter("phone");
		PrintWriter out = res.getWriter();
		out.print("Hi.. my name is " + name + " and i am using " + phone + " phone.");
	}
}
