<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Form</title>
</head>
<body>
<div class="container">
  <div class="row">
     <div class="col-md-6">
     <form action="AddressServlet" method="post" id="fileForm" role="form">
     <fieldset><legend class="text-center">Add address<span class="req"><small>required*</small></span></legend>
     
     
     <div class="form-group">
     <label for="house-no"><span class="req">*</span>House number</label>
       <input class="form-control" type="text" name="hname" id="txt" onkeyup="validate(this)" required/>
     </div>
     
     <div class="form-group">
     <label for="street"><span class="req">*</span>Street: </label>
       <input class="form-control" type="text" name="Street" id="txt" onkeyup="validate(this)" required/>
     </div>
     <div class="form-group">
     <label for="pincode"><span class="req">*</span>PinCode:</label>
       <input class="form-control" type="text" name="pin" id="txt" onkeyup="validate(this)" required/>
     </div>
     
     <div class="form-group">
       <input class="btn-btn-success" type="submit" name="submit_reg" value="Submit">
     </div>
     
     
     
     
     </fieldset>
     </form>
</div>
</body>
</html>