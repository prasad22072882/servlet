package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/save")
public class NameFilter implements Filter {
	public void destroy() {
		System.out.println(this.getClass().getName() + " destroyed.");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String name = req.getParameter("sname");
		PrintWriter out = response.getWriter();
		if (name.length() >= 2) {
			System.out.println("name is filtered.");
			chain.doFilter(request, response);
		}
		else
			out.println("Invalid name");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(this.getClass().getName() + " invoked.");
	}
}
