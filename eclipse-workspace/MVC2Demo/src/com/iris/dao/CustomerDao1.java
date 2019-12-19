package com.iris.dao;
import java.util.List;

import com.iris.model.Customer;

public interface CustomerDao1 {


	public boolean registerCustomer(Customer cust) throws Exception;
	public Customer validateCustomer(int id,String password) throws Exception;
	public List<Customer> getAllCustomers() throws Exception;
	public boolean deleteCustomer(int customerId) throws Exception ;
	public Customer getCustomer(int customerId) throws Exception ;
	public boolean updateCustomer(Customer cust) throws Exception ;




}
