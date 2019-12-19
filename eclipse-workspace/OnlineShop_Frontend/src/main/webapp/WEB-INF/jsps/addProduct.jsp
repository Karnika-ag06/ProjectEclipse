<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<c:set var="js" value="${pageContext.request.contextPath}/resources/js" scope="application"/> 
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>

<div align = "center">
<h1>Add Product</h1>

<form:form  action="addProduct" id="proForm" method="post" modelAttribute="productObj" >

		<table>
			
			<tr>
			<th>Product Name</th>
			<td><form:input path="productName" id="Pname"/></td>
			</tr>
			
			
			<tr>
			<th>Product Price</th>
			<td><form:input path="price" id="Proprice"/></td>
			</tr>
			
			<tr>
			<th></th>
			<td><input type="submit" id="addPro" value="Add Product" /></td>
			</tr>
		</table>
</form:form>
</div>
</body>
	<script type="text/javascript">
	  $(document).ready(function(){
		  $("#addPro").click(function(){
		  var a=$("#Pname").val();
		  var b=$("#Proprice").val();
		  
		  var result =confirm("are you sure: "+a+" "+b);
		  if(result==true)
		   $("#proForm").submit();
		   else
		      return false;
		      });
		  });
	  </script>
</html>