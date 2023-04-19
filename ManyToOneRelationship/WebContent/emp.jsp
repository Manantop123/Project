<%@page import="com.dao.empdao"%>
<%@page import="com.bean.dept"%>
<%@page import="com.bean.emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="myform" method="post" action="employeecontroller">
<h1 align="center">Employee Form</h1>
<table align="center">
	<tr>
		<td>Emp_Name</td>
		<td><input type="text" name="fname" onblur="checkfname();"></td>
		<td><span id="fname" style="color:red"></span></td>
	</tr>
	<tr>
		<td>Designation</td>
		<td><input type="text" name="design" onblur="checklocation();"></td>
		<td><span id="design" style="color:red"></span></td>
	</tr>
		<tr>
		<td>Department</td>
		<td>
			<select name="dept">
				<option>-----department------</option>
				<%
					List<dept> list = empdao.getallbydept();
					for(dept d : list)
					{
				%>
					<option value="<%=d.getD_id()%>"><%=d.getD_name()%></option>
				<% 
					}
				%>
				
			</select>
		</td>
	</tr>
	<tr>
		<td><input type="submit" name="action" value="add emp"></td>
	</tr>

</table>
</form>
</body>
</html>