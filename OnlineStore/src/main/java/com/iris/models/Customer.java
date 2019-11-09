package com.iris.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customertableee")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int customerId;
	 private String customerName;
	 private String gender;
	 private String emailaddress;
	 private String password;
	 private String city;
	 private String role;
	

	 
	 
	 
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String gender, String emailaddress, String password, String city,String Role) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.emailaddress = emailaddress;
		this.password = password;
		this.city = city;
		this.role=Role;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", emailaddress=" + emailaddress + ", password=" + password + ", city=" + city + ", role=" + role
				+ "]";
	}
	
	
}
