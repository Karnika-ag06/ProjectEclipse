<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Address</title>
</head>
<body>

<div align="center">
<h1>Address</h1>

<c:forEach items="${sessionScope.user.s }" var="obj">
      <div class="form-group" text-align="center">
     <label for="house-no">House number: </label>
      ${obj.house_no}
     </div>

     <div class="form-group">
     <label for="street">Street: </label>
     ${obj.street}
     </div>

     <div class="form-group">
     <label for="pincode">Pincode: </label>
     ${obj.pinCode}
     </div>
     <br/>
 </c:forEach>
</div>
   </body>
  </html>