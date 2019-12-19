<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome customer</title>
</head>
<body>
	<div align="right">
		Welcome ${user.userName}
	</div>
	<hr/>
	
	<div align="center" style="font-color:'red'">
		<h1 >Welcome User</h1>
	</div>
	
       <div align="center">
	        <h2><a href="Address.jsp">Add Address</a></h3>
		    <h2><a href="ViewAddress.jsp">View Address</a></h3>
			<h2><a href="">View Profile</a></h3>
			<h3><a href="">Change Password</a></h3>
		    <h3><a href="">Logout</a></h3>

</div>
		
</body>
</html>
