package com.iris.test;

import java.sql.PreparedStatement;
import java.util.Scanner;

import com.iris.dao.EmployeeDao;
import com.iris.daoimpl.EmployeeDaoImpl;
import com.iris.models.Employee;

public class MainClass {
	
	static Scanner sc=new Scanner(System.in);	
	static EmployeeDao daoObj=new EmployeeDaoImpl();
	
	static void insertEmployee() throws Exception{
		System.out.println("Enter employee details");
		int id=sc.nextInt();
		String name=sc.next();
		String gender=sc.next();
		String pass=sc.next();
		
		
		Employee emp=new Employee();
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setGender(gender);
		emp.setPassword(pass);
		
		boolean r=daoObj.addEmployee(emp);
		if(r==true){
			System.out.println("Employee Added");
		}
		else {
			System.out.println("Problem in Adding Employee");
		}
	}
	static void deleteEmployee() throws Exception{
		System.out.println("enter id you want to delete");
		int id=sc.nextInt();
		boolean r=daoObj.deleteEmployee(id);	
		
		System.out.println("deletion successful");
	}
		
	static void getEmployeebyId() throws Exception{
		System.out.println("enter the id you want to see details");
		int id=sc.nextInt();
		Employee r=daoObj.getEmployeebyId(id);	
		
		System.out.println("employee display "+r);
	}
	
	static void validateEmployee() throws Exception{
		System.out.println("enter the id and password");
		int id=sc.nextInt();
		String pass=sc.next();
		
		boolean r=daoObj.validateEmployee(id,pass);	

		System.out.println("validate successfully");
}
	
	
	public static void main(String[] args) {
	

	System.out.println("Enter the operation u want to perform");
	System.out.println("1. Insert New Employee");
	System.out.println("2. Delete Employee");
	System.out.println("3. Get Employee By Id");
	System.out.println("4. Validate Employee");
	System.out.println("5. Get All Employees");
	
	try {
	
	int choice=sc.nextInt();
	switch(choice){
		case 1 : 
			insertEmployee();
			break;
		case 2 : 
			deleteEmployee();
			break;
		case 3 : 
			getEmployeebyId();
			break;
		case 4 : 
			validateEmployee();
			break;
		case 5 : 
			daoObj.getAllEmployee();
			break;
		default : 
				System.out.println("Invalid Choice");
	     }
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}

}
