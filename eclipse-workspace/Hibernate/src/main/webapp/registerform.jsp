<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<br/>
  <h2 style="text-align:center">Registration Form</h2>
  <form action="RegisterFormServlet" method="post" >
    
    <div class="form-group">
      <label for="username">User Name:</label>
      <input type="text" class="form-control" id="username" placeholder="Enter name" name="uname">
    </div>
     
      <div class="form-group">
    <label for="gender"><b>Gender:</b></label>
      <input type ="radio" name="gender" value="male" checked="true">Male 
      <input type ="radio" name="gender" value="female" >Female<br/><br/>
      </div>
   
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
  
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="upass">
    </div>
   
    <div class="form-group">
      <label for="city"><b> City:</b></label>
<select name="city">
        <option value="none">-----Select city------</option>
        <option >Noida</option>
        <option >Gurgaon</option>
        <option >Banglore</option>
        <option >Chandigarh</option>
        <option >Delhi</option>
         </select>
    </div>
    <div class="form-group">
      <label for="role">Role:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter role" name="role">
    </div>
   
   <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>




