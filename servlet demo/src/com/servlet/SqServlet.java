package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num = (Integer) req.getAttribute("sum");
		int result = num * num;
		PrintWriter out = res.getWriter();
		out.println("Result is: " + result);
	}
}