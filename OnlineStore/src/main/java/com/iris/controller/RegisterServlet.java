package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.models.Customer;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		CustomerDao cs=new CustomerDaoImpl();
	
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		String s4=request.getParameter("t4");
		String s5=request.getParameter("t5");
		String s6=request.getParameter("city");
			
		Customer c=new Customer();
		
		c.setCustomerName(s2);
		c.setGender(s3);
		c.setEmailaddress(s4);
		c.setPassword(s5);
		c.setCity(s6);
		boolean r=false;
		try {
			r=cs.registerCustomer(c);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(r==true) {
			HttpSession session=request.getSession();
			RequestDispatcher rd=request.getRequestDispatcher("RegisterProcess.jsp");
			rd.forward(request, response);
			
		}
		else {
			out.println("Not Registerd!!");
		}
		}
		
	}


