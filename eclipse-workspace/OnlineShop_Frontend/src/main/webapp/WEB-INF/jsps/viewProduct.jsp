<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Products</title>
</head>
<body>

<div align="center">
		<table border=1>
				<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
				</tr>
		
		<c:forEach items="${pList}" var="obj">
		<tr>
				<td>${obj.productId}</td>
				<td>${obj.productName}</td>
				<td>${obj.price}</td>
		</tr>
		</c:forEach>			
		</table>

</div>
</body>
</html>