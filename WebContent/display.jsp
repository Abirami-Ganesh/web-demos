<%@page import="com.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VIEW PAGE</title>
</head>
<body>
	<table>
		<tr>
			<th>NAME</th>
			<th>PASSWORD</th>
			<th>DATE</th>
			<th>GENDER</th>
			<th>ADDRESS</th>
			<!-- rest of you columns -->
		</tr>

		<c:forEach var="register" items="${requestScope.register}" >
			<tr>
				<td>${register.name}</td>
				<td>${register.password}</td>

				<td>${register.date}</td>
				<td>${register.gender}</td>
				<td>${register.address}</td>


				<!-- rest of you columns data-->
			</tr>
		</c:forEach>
	</table>
</body>
</html>