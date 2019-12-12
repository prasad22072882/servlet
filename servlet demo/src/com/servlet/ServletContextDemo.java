package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletConfig sconfig = getServletConfig();
		String name = sconfig.getInitParameter("name"); // Get values from web.xml file
		String phone = sconfig.getInitParameter("phone");
		PrintWriter out = res.getWriter();
		out.println("Hi.. my name is " + name + " and i am using " + phone + " phone.");

		ServletContext scontext = getServletContext();
		String globalName = scontext.getInitParameter("name");
		String globalPhone = scontext.getInitParameter("phone");
		out.println("Hi.. my name is " + globalName + " and i am using " + globalPhone + " phone.");
	}
}
