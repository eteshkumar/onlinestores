<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.iris.models.*"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<div align="center" style="color:red" >
<table border="1">
 	<tr>
 		<th>Customer Id</th>
 		<th>Customer Name</th>
 		<th>Gender</th>
 		<th>EMailAddress</th>
 		<th>City</th>
 		<th>Role</th>
	</tr>
	
 <c:forEach var="obj" items="${custObj}">
 	<tr>
 		<td>${obj.customerId}</td>
 		<td>${obj.customerName}</td>
 		<td>${obj.gender}</td>
 		<td>${obj.emailaddress}</td>
 		<td>${obj.city}</td>
 		<td>${obj.role}</td>
 		<td> <a href="Update?cid=${obj.customerId}">Update</a></td>
 		<td> <a href="Delete?cid=${obj.customerId}">Delete</a></td>
 	</tr>	
 </c:forEach>
</table>
</div>	
</body>
</html>