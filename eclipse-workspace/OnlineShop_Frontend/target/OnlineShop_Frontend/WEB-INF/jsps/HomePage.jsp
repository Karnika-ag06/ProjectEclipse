<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<c:set var="js" value="${pageContext.request.contextPath}/resources/js" scope="application"/> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>


</head>
<body>

 <%-- <img src="${images}/image1.png">
 --%>
	
	
	<div align="center">
	<h1>${msg}</h1>
	${msg1}
	</div>
	
	<hr>
	
	<div align="center">
	<h1><a href="getAddProductForm">Add Product</a></h1>
	<h1><a href="getAllProduct">View Product</a></h1>
	</div>

</body>
</html>