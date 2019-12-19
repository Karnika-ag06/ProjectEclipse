package com.iris.daosimpl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iris.utility.ConnectionProvider;
import com.iris.daos.CustomerDao;
import com.iris.model.Customer;


public class CustomerDaoImpl implements CustomerDao {
	
Connection conn=ConnectionProvider.getConn();
	
	public boolean registerCustomer(Customer cust) throws Exception{
		PreparedStatement ps=conn.prepareStatement("insert into Newcustomer values(?,?,?,?,?,?,'customer')");
		ps.setInt(1,cust.getCustomerId());
		ps.setString(2,cust.getCustomerName());
		ps.setString(3,cust.getGender());
		ps.setString(4,cust.getEmailAddress());  	
		ps.setString(5,cust.getPassword());  	
		ps.setString(6,cust.getCity()); 
		
	int i=ps.executeUpdate();
		if(i!=0)
			return true;
			return false;
	}


	
	public 	Customer validateCustomer(int id,String password) throws Exception{
	
		PreparedStatement ps=conn.prepareStatement("select * from Newcustomer where id=? and password=?");
		ps.setInt(1,id);
		ps.setString(2,password);
	 
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int id1=rs.getInt(1);
			String s2=rs.getString(2);
			String s3=rs.getString(3);
			String s4=rs.getString(4);
			String s5=rs.getString(5);
			String s6=rs.getString(6);
			String s7=rs.getString(7);
			
			Customer cus= new Customer(id1,s2,s3,s4,s5,s6,s7);
	return cus;		
			
		}
	return null;
	}	
	
	public List<Customer> getAllCustomers() throws Exception {
		 List<Customer> cusList=new ArrayList<>();
			
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select * from Newcustomer where role='customer'");
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String gen=rs.getString(3);
				String email=rs.getString(4);
				String pass=rs.getString(5);
				String city=rs.getString(6);
				
				Customer cus=new Customer();
				cus.setCustomerId(id);
				cus.setCustomerName(name);
				cus.setGender(gen);
				cus.setEmailAddress(email);
				cus.setPassword(pass);
				cus.setCity(city);
				
				cusList.add(cus);
				
			}
			System.out.println(cusList);
			return cusList;
		
	}
	public boolean deleteCustomer(int customerId) throws Exception {
		PreparedStatement ps=conn.prepareStatement("delete from Newcustomer Where id=?");
		ps.setInt(1,customerId);
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		return false;
	}
	
	public Customer getCustomer(int customerId) throws Exception {
		PreparedStatement ps=conn.prepareStatement("select *  from Newcustomer Where id=?");
		ps.setInt(1,customerId);
		
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
		int id=rs.getInt(1);
		String name=rs.getString(2);
		String gen=rs.getString(3);
		String email=rs.getString(4);
		String pass=rs.getString(5);
		String city=rs.getString(6);
		String role=rs.getString(7);
		

		Customer cus= new Customer(id,name,gen,email,pass,city,role);
        return cus;		
		
      }
	return null;
	}




	public boolean updateCustomer(Customer cust) throws Exception {
		PreparedStatement ps=conn.prepareStatement("update Newcustomer set customername=?,gender=?,emailaddress=?,password=?,c_city=? where id=?");
		
		
		ps.setString(1,cust.getCustomerName());
		ps.setString(2,cust.getGender());
		ps.setString(3,cust.getEmailAddress());  	
		ps.setString(4,cust.getPassword());  	
		ps.setString(5,cust.getCity()); 
		ps.setInt(6,cust.getCustomerId()); 
		
		
	int i=ps.executeUpdate();
		if(i!=0) 
			return true;
			return false;
	
		
		
	}
}
































