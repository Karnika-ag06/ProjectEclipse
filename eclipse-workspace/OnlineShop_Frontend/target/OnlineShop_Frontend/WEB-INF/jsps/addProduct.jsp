<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="${js}/confirm.js"></script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>

<div align = "center">
<h1>Add Product</h1>

<form:form  action="addProduct" method="post" modelAttribute="productObj" onsubmit=" return confirmMsg()" >

		<table>
			
			<tr>
			<th>Product Name</th>
			<td><form:input path="productName" id="name"/></td>
			</tr>
			
			
			<tr>
			<th>Product Price</th>
			<td><form:input path="price"/></td>
			</tr>
			
			<tr>
			<th></th>
			<td><input type="submit" value="Add Product" onclick=" return confirmMsg()"/></td>
			</tr>
		</table>
</form:form>

</div>

</body>
</html>