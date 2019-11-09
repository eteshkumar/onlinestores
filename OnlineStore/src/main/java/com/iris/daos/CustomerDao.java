package com.iris.daos;

import java.util.List;

import org.apache.tomcat.jni.Address;

import com.iris.models.Customer;

public interface CustomerDao {
	public boolean registerCustomer(Customer cust) throws Exception;
	public Customer validateUser(int userid,String password) throws Exception; 
	public List<Customer> ViewCustomers() throws Exception;
	public boolean deleteCustomer (int cid) throws Exception;
	public boolean updateCustomer (Customer c) throws Exception;
	public Customer getCustomer(int id) throws Exception;



}
