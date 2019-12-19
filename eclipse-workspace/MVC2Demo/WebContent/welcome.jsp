
  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome customer</title>
</head>
<body>
	<div align="right">
		Welcome ${sessionScope.user.customerName}
	</div>
	<hr/>
	
	<div align="center" style="font-color:'red'">
		<h1 >Welcome Customer</h1>
	</div>
</body>
</html>
