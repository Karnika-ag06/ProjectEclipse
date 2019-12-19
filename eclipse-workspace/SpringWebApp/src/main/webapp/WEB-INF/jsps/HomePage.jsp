<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<c:set var="css" value="${pageContext.request.contextPath}/resources/css" scope="application"/>
<c:set var="images" value="${pageContext.request.contextPath}/resources/images" scope="application"/>
<html>
	<head>
		<title>Spring Web MVC</title>
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<img src="${images}/logo.png" >
		
		<div align="center">
		<h1><a href="getLoginForm">Log In</a></h1>
		<h1><a href="SignUpForm">Sign Up</a><br/></h1>
		</div>
	
	</body>
</html>                                            