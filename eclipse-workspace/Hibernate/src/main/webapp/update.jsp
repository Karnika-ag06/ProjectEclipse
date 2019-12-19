<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update Page</title>
</head>
<body>
	
		<div align='center' style='color:red'><h1>Details of all customers</h1></div><br/>
	
		<form action='UpdateValServlet'>
		<table border='1' align='center'>
		
	    <tr>
		<th>City</th>
		<td><input type='text' name='city' value="${c.city}" ></td>
		</tr>
		
		<tr>
		<th>Email Address</th>
		<td><input type='text' name='email' value="${c.email}" ></td>
		</tr>
		
		<tr>
		<th>Gender</th>
		<td><input type='text' name='gender' value="${c.gender}" ></td>
		</tr>
	
		<tr>
		<th>Password</th>
		<td><input type='text' name='password' value="${c.password}" ></td>
		</tr>
		
		<tr>
		<th>Name</th>
		<td><input type='text' name='uname' value="${c.userName}" ></td>
		</tr>
		
		
		<tr>
		<th></th>
		<td><input type='submit' name='btn'></td>
		</tr>
		
		</table></form>
</body>
</html>