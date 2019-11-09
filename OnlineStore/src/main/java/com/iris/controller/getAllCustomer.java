package com.iris.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

/**
 * Servlet implementation class getAllCustomer
 */
@WebServlet("/getAllCustomer")
public class getAllCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao dao=new CustomerDaoImpl();
		List<Customer> a=new ArrayList<Customer>();
		try {
			a=dao.ViewCustomers();
		}
		catch(Exception e) {
		e.printStackTrace();	
		}
		
		if(a.size()!=0) {
			request.setAttribute("custObj", a);
			RequestDispatcher rd=request.getRequestDispatcher("ViewAllCustomers.jsp");
			rd.forward(request, response);
		}

	}

}
