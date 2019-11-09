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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LoginServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		CustomerDao dao = new CustomerDaoImpl();
		String s1 = request.getParameter("userid");
		int id=Integer.parseInt(s1);
		String s2 = request.getParameter("password");

		Customer c=null;
			try {
				c = dao.validateUser(id,s2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		if (c!=null) {
			
			HttpSession session=request.getSession();
			session.setAttribute("custObj",c);
			if(c.getRole().equals("customer")) {
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}
			else if (c.getRole().equals("admin")) {
				RequestDispatcher rd=request.getRequestDispatcher("AdminServlate");
				rd.forward(request, response);	
					
		} }
		else {
			out.println("Invalid Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	
	}
	}


