<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<div align="right">
		Welcome ${sessionScope.user.customerName}	</div>
	<hr/>
	
	<div align="center">
		<h1>Customers List</h1>
		<table border="1">
			<tr>
				<th>Customer Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>City</th>
				<th>Role</th>
			</tr>
			<c:forEach items="${customerList}" var="obj">
				<tr>
					<td>${obj.customerId}</td>
					<td>${obj.customerName}</td>
					<td>${obj.gender}</td>
					<td>${obj.emailAddress}</td>
					<td>${obj.password}</td>
					<td>${obj.city}</td>
					<td>${obj.role}</td>
					
					<td><a href="Update?cId=${obj.customerId}">Update</a></td>
					<td><a href="delete?cId=${obj.customerId}">Delete</a></td>
				</tr>
			</c:forEach>	
		</table>
		
	</div>
</body>
</html>