package com.iris.daoimpl;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.iris.dao.EmployeeDao;
import com.iris.models.Employee;
import com.iris.utility.ConnectionProvider;


public class EmployeeDaoImpl  implements EmployeeDao{
	Connection conn=ConnectionProvider.getConn();
	
	public boolean addEmployee(Employee e) throws Exception{
		PreparedStatement ps=conn.prepareStatement("insert into EmployeeNew values(?,?,?,?)");
		ps.setInt(1,e.getEmployeeId());
		ps.setString(2,e.getEmployeeName());
		ps.setString(3,e.getGender());
		ps.setString(4,e.getPassword());
		
		
		int i=ps.executeUpdate();
		if(i!=0)
			return true;
			return false;
	}

	
	public boolean deleteEmployee(int employeeId) throws Exception {
		PreparedStatement ps=conn.prepareStatement("delete from EmployeeNew Where Emp_Id=?");
		ps.setInt(1,employeeId);
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		return false;
	}

	
	

	public boolean validateEmployee(int empId, String empPass) throws Exception{
		PreparedStatement ps=conn.prepareStatement("select * from EmployeeNew where Emp_Id=? and Password=?");
		ps.setInt(1, empId);
		ps.setString(2,empPass);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()){
			return true;
		}
		
		return false;
	}

public Employee getEmployeebyId(int eid) throws Exception {
		PreparedStatement ps=conn.prepareStatement("select * from EmployeeNew where Emp_Id=?");
		ps.setInt(1, eid);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gen=rs.getString(3);
			String pass=rs.getString(4);
			
			
			Employee emp=new Employee();
			emp.setEmployeeId(id);
			emp.setEmployeeName(name);
			emp.setGender(gen);
			emp.setPassword(pass);
			
			
			return emp;
		}
		
		return null;
		
	}



	public List<Employee> getAllEmployee() throws Exception {
    List<Employee> empList=new ArrayList<>();
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from EmployeeNew");
		while(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gen=rs.getString(3);
			String pass=rs.getString(4);
			
			Employee emp=new Employee();
			emp.setEmployeeId(id);
			emp.setEmployeeName(name);
			emp.setGender(gen);
			emp.setPassword(pass);
			
			
			empList.add(emp);
			
		}System.out.println(empList);
		return empList;
		
	}
}
 
