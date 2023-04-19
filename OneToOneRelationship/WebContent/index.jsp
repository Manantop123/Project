<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="myform" action ="empcontroller" method="post">
<h1 align="center">registration form</h1>
<table align="center">
	<tr>
		<td>fname</td>
		<td><input type="text" name="fname"></td>
	</tr>
	<tr>
		<td>lname</td>
		<td><input type="text" name="lname"></td>
	</tr>
	<tr>
		<td>gender</td>
		<td>
		<input type="radio" name="gender" value="male">male
		<input type="radio" name="gender" value="female">female
		</td>
	</tr>
	<tr>
		<td>job</td>
		<td><input type="text" name="job"></td>
	</tr>
	<tr>
		<td>salary</td>
		<td><input type="text" name="salary"></td>
	</tr>
	<tr>
		<td><input type="submit" name="action" value="insert"></td>
	</tr>
</table>
</form>
</body>
</html>