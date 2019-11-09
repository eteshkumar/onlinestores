package com.iris.daosimpl;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.daos.CustomerDao;
import com.iris.models.Customer;
import com.iris.utility.SessionFactoryProvider;

public class CustomerDaoImpl implements CustomerDao {
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();


	public boolean registerCustomer(Customer cust) throws Exception {
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			cust.setRole("customer");
			session.save(cust);
			tx.commit();
			session.close();
			return true;
			}
				catch(Exception e) {
					e.printStackTrace();
				}
		return false;
	}

	public Customer validateUser(int userid, String password) throws Exception {
		try {
		Session session=sf.openSession();
		Customer obj=session.get(Customer.class,userid);
		if(obj==null) {
			return null;
		}
		else {
			String s1=obj.getPassword();
			if(s1.equals(password)) {
				return obj;
			}
			session.close();
			return obj;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	public List<Customer> ViewCustomers() throws Exception {
		try {
			Session session=sf.openSession();
			Query<Customer> query=session.createQuery("from com.iris.models.Customer where role='customer'");
            
          List<Customer> userList = query.list();
          session.close();
          return userList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteCustomer(int cid) throws Exception {
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Customer obj=session.get(Customer.class,cid);
			if(obj==null) {
				return false;	
			}
			else {
				session.delete(obj);
			}
			tx.commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean updateCustomer(Customer c) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer getCustomer(int id) throws Exception {
	              	              try {
	              Session session = sf.openSession();
	              Customer obj = session.get(Customer.class, id);
	              session.close();
	              return obj;

	              } catch (Exception e) {
	                     e.printStackTrace();
	              }

	              return null;

	}

}
