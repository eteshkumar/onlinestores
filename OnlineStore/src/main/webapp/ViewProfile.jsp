<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	
	<tr>
		<td>${custObj.customerId}</td>
		 <td>${custObj.customerName}</td>
		 <td>${custObj.gender}</td>
		<td>${custObj.emailaddress}</td>
		<td>${custObj.city}</td>
		<td>${custObj.role}</td> 
	</tr>	
 </table>
 </div>
</body>
</html>