<%@page import="com.dao.empdao"%>
<%@page import="com.util.emputil"%>
<%@page import="com.bean.employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
<table class = "table table-striped">
<tr>
	<th>ID</th>
	<th>FNAME</th>
	<th>LNAME</th>
	<th>EMAIL</th>
	<th>MOBILE</th>
	<th>GENDER</th>
	<th>ADDRESS</th>
</tr>
<%
	List<employee> list = empdao.getallemployee();
	for(employee e : list)
	{
%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getFname() %></td>
			<td><%=e.getLname()%></td>
			<td><%=e.getEmail() %></td>
			<td><%=e.getMobile() %></td>
			<td><%=e.getGender() %></td>
			<td><%=e.getAddress() %></td>
			
			<form name="edit"  method="post" action="employeecontroller">
				<td>
					<input type="hidden" name="id" value=<%=e.getId()%>>
					<input type="submit" name="action" value="edit" class="btn btn-danger" >
				</td>
			</form>
			
			<form name="delete" method="post" action ="employeecontroller">
				<td>
					<input type="hidden" name="id" value=<%=e.getId() %>>
					<input type="submit" name="action" value="delete" class="btn btn-danger">
				</td>
			</form>
		</tr>
<% 		
	}
%>
</table>
</body>
</html>