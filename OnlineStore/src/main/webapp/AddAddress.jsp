<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address</title>
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
body{
background-color:cyan;
}
</style>
</head>
<body >
<form action="AddAddress" method="post">
<div align=center>
<table>
<tr>
<td>Locality </td>
<td><input type="text" name="locality"  class="Id" placeholder="Enter Ur Locality" ></td>
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
<tr>
<td>Select State:</td>
<td><select name="state">
    <option value="none">.....select state.......</option>
    <option value="UttarPradesh">UttarPrades</option>
    <option value="Bihar">Bihar</option>
    <option value="Delhi">Delhi</option>
    <option value="Rajasthan">Sasaram</option>
    <option value="MP">MP</option>
    <option value="Maharashtra">Maharashtra</option>
    <option value="J&K">J&K</option>
    </select>
</td>
</tr>
<tr>
<td>Pin Code:</td>
<td><input type="number" name="pin" class="Id" placeholder="Enter Ur PIN"></td>
<tr align=center>
<td><input type="submit"   name="submit" text-align ="center" value="submit"></td>
</tr>
</table>
</div>
</form>
</body>
</html>