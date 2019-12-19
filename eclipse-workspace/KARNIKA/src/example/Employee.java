package example;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;

public class Employee {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.drivre.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("connection established");
       }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
