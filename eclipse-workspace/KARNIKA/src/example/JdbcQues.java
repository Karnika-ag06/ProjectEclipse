package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class JdbcQues {

	static InputStreamReader isr=new InputStreamReader(System.in);	
	static BufferedReader br=new BufferedReader(isr);
    static Connection conn= null;
	
    static {
    	try {
    		
        Class.forName("oracle.jdbc.driver.OracleDriver");
	    conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    	
	static void insertEmployee() throws Exception
	{
		System.out.println("enter id,name,gender and password of employee");
		int eid=Integer.parseInt(br.readLine());
	    String name1=br.readLine();
		String gen=br.readLine();
		String pass=br.readLine();
		
		
	    PreparedStatement ps=conn.prepareStatement("insert into employeeNew values(?,?,?,?)");
		ps.setInt(1,eid);
		ps.setString(2,name1);
		ps.setString(3,gen);
		ps.setString(4,pass);
		
		int i=ps.executeUpdate();
		
		System.out.println("data inserted successfully");
		
		
	}	
	
static void deleteEmployee() throws Exception
	    {
	    	System.out.println("ENTER ID OD EMPLOYEE U WANT TO DELETE");
	    	int id=Integer.parseInt(br.readLine());
	        
	    	PreparedStatement ps=conn.prepareStatement("delete from employeeNew where emp_id=?");
	    	
	        ps.setInt(1,id);
	        int i=ps.executeUpdate();
			
	        System.out.println("deletion successfult");
			
	    }

static void getEmployeeId() throws Exception
{
	System.out.println("ENTER ID of employee you want to see data");
	int id=Integer.parseInt(br.readLine());
	
	PreparedStatement ps=conn.prepareStatement("select emp_id,emp_name,gender from employeeNew where emp_id=?");
	ps.setInt(1,id);
	 
	
	 ResultSet rs=ps.executeQuery();
     while(rs.next()) {
	   
	   int emp_id=rs.getInt(1);
	   String emp_name=rs.getString(2);
	   String gender=rs.getString(3);
		System.out.println(emp_id+" "+emp_name+" "+gender);   
   }

}
static void validateEmployee() throws Exception
{
	System.out.println("ENTER ID and password");
	int id=Integer.parseInt(br.readLine());
    String pass=br.readLine();

	PreparedStatement ps=conn.prepareStatement("select emp_name from employeeNew where emp_id=? and password=?");
	ps.setInt(1,id);
	ps.setString(2,pass);
	
	 ResultSet rs=ps.executeQuery();
 if(rs.next()==true)
 {
	   
	   String name=rs.getString(1);
	   System.out.println(name+" ");   
   }
 else {
	   System.out.println("invalid ");   
 
}

}
static void getAllEmployee() throws Exception
{
	System.out.println("data of all employees");

	Statement st=conn.createStatement();

	 ResultSet rs=st.executeQuery("select emp_id,emp_name,gender,password from employeeNew");
    while(rs.next()) {
	   
	   int emp_id=rs.getInt(1);
	   String emp_name=rs.getString(2);
	   String gender=rs.getString(3);
	   String password=rs.getString(3);
	   
		System.out.println(emp_id+" "+emp_name+" "+gender+" "+password);   
    }
}


	 
public static void main(String[] args) {
		try {
	    System.out.println("\n=======enter the operation you want to perform======");
		System.out.println("1.insert employee");
		System.out.println("2.delete employee");
		System.out.println("3.get employee by id");
		System.out.println("4.validate employee");
		System.out.println("5.get all employee");
		
		int choice=Integer.parseInt(br.readLine());
		switch(choice){
		case 1: 
			insertEmployee();
		break;
		case 2: 
			deleteEmployee();
		break;
		case 3: 
			getEmployeeId();
		break;
		case 4: 
			validateEmployee();
		break;
		case 5: 
			getAllEmployee();
		break;
		default:
			System.out.println("invalid choice");
			}
}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
}


