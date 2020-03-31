<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
<body>
<form action="RegisterServlet">
NAME	      :<input type="text" name="name"/><br><br>
PASSWORD      :<input type="password" name="password"/><br><br>
DATE OF BIRTH :<input type="text" name="dob"/><br><br>
GENDER		  :<input type="radio" name="gender" value="male"/>MALE
			   <input type="radio" name="gender" value="female"/>FEMALE<br><br>
ADDRESS		  :<textarea rows="5" cols="7" name="address"></textarea><br><br>
<input type="submit" value="REGISTER">

</form>

</body>
</html>