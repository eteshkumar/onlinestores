package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		CustomerDao cs=new CustomerDaoImpl();
		String s=request.getParameter("cid");
		int n=Integer.parseInt(s);
		boolean r=false;
		try {
			r=cs.deleteCustomer(n);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(r==true) {
			
			RequestDispatcher rd=request.getRequestDispatcher("ViewAllCustomers.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("Not Deleted!");
		}
	}

}
