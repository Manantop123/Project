<%@page import="com.dao.empdao"%>
<%@page import="com.bean.employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
welcome to hibernatebasic
<table class="table">
<tr>
	<th>ID</th>
	<th>FNAME</th>
	<th>LNAME</th>
	<th>mobile</th>
		<th>GENDER</th>
</tr>

<%
	List<employee> list = empdao.getemployee();
	for(employee e : list)
	{
%>
	<tr>
		<td><%=e.getId()%></td>
		<td><%=e.getFname()%></td>
		<td><%=e.getLname()%></td>
		<td><%=e.getMobile()%></td>
		<td><%=e.getGender()%></td>
		
		<form name="edit" method="post" action="employeecontroller">
			<td>
				<input type="hidden" name="id" value="<%=e.getId()%>">
				<input type="submit" name="action" value="edit" class="btn btn-danger">
			</td>
		</form>
		
		<form name="delete" method="post" action="employeecontroller">
			<td>
				<input type="hidden" name="id" value="<%=e.getId()%>">
				<input type="submit" name="action" value="delete" class="btn btn-danger">
			</td>
		</form>
	
<% 		
	}
%>
</tr>	
</table>
</body>
</html>