<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<style>
.Id{
background-color:"cyan";
}
table tr td{
font-size:20px;
padding:30px;
}
table tr td input{
border-radius:5px;

}
table tr td input select{
border-radius:5px;
}

</style>
</head>
<body>
<div align=center>
<form action="RegisterServlet" method="POST">
<table>
<tr>
<td>CustomerName: </td>
<td><input type="text" name="t2"  class="Id" placeholder="Enter name" required></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" name="t3" value="Male">Male</td>
<td><input type="radio" name="t3" Value="Female" >Female</td>
</tr>
<tr>
<td>Email Address:</td>
<td><input type="email" name="t4"  class="Id" placeholder="Enter Email" required></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password"  name="t5" class="Id" placeholder="Enter Password" required></td>
</tr>
<tr>
<td>Select city:</td>
<td><select name="city">
    <option value="none">.....select city.......</option>
    <option value="noida">Noida</option>
    <option value="g.noida">G.Noida</option>
    <option value="patna">Patna</option>
    <option value="sasaram">Sasaram</option>
    <option value="jhansi">Jhansi</option>
    <option value="rajasthan">rajasthan</option>
    <option value="kota">Kota</option>
    <option value="pune">Pune</option>
    <option value="banglore">Banglore</option>
    </select>
</td>
</tr>
<tr align=center>
<td><input type="submit"   name="submit" text-align ="center" value="submit"></td>
</tr>
</table>
</form>
</div>
</body>
</html>