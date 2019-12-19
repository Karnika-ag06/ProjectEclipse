<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<div align="right">
		Welcome ${user.userName}	</div>
	<hr/>
	
	<div align="center">
		<h1>Users List</h1>
		<table border="1">
			<tr>
				<th>USER Id</th>
				<th>User Name</th>
				<th>password</th>
				<th>Gender</th>
				<th>City</th>
				<th>Role</th>
				<th>email</th>
				
			</tr>
			<c:forEach items="${userList}" var="obj">
				<tr>
					<td>${obj.userId}</td>
					<td>${obj.userName}</td>
					<td>${obj.password}</td>
					<td>${obj.gender}</td>
					<td>${obj.city}</td>
					<td>${obj.role}</td>
					<td>${obj.email}</td>
					
					
					
					<td><a href="UpdateServlet?uid=${obj.userId}">Update</a></td>
					<td><a href="DeleteServlet?uid=${obj.userId}">Delete</a></td>
				</tr>
			</c:forEach>	
		</table>
		
	</div>
</body>
</html>