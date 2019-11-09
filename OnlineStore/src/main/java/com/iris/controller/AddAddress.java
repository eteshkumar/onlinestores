package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.models.Address;
import com.iris.models.Customer;

public class AddAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddAddress() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("city");
		String s3=request.getParameter("state");
		String s4=request.getParameter("pin");
		int num=Integer.parseInt(s4);
		
		Address adr=new Address();
		adr.setLocality(s1);
		adr.setCity(s2);
		adr.setState(s3);
		adr.setPin(num);
		
		HttpSession session=request.getSession();
		Customer cust=(Customer)session.getAttribute("cust");
		
	
		
	
		
		
	
	}

}
