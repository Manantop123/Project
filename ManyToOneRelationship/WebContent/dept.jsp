<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function checkfname()
	{
		var f = document.myform.dname.value;
		
		var reg = /^[a-zA-Z]+$/;
		
		if(f=="")
		{
			document.getElementById("dname").innerHTML="enter first name";
		}	
		else if(!reg.test(f))
		{
			document.getElementById("dname").innerHTML="first name";
		}
		else
		{
			document.getElementById("dname").innerHTML="";
		}
	}
	
	function checklocation()
	{
		var l = document.myform.d_location.value;
		
		var reg = /^[a-zA-Z0-9]+$/;
		
		if(l=="")
		{
			document.getElementById("loc").innerHTML="enter location";
		}
		else if(!reg.test(l))
		{
			document.getElementById("loc").innerHTML="location";
		}	
		else
		{
			document.getElementById("loc").innerHTML="";
		}
	}
</script>
</head>
<body>
<form name="myform" method="post" action="employeecontroller">
<h1 align="center">Department Form</h1>
<table align="center">
	<tr>
		<td>Dept_Name</td>
		<td><input type="text" name="dname" onblur="checkfname();"></td>
		<td><span id="dname" style="color:red"></span></td>
	</tr>
	<tr>
		<td>Dept_Location</td>
		<td><input type="text" name="d_location" onblur="checklocation();"></td>
		<td><span id="loc" style="color:red"></span></td>
	</tr>
	<tr>
		<td><input type="submit" name="action" value="add dept"></td>
	</tr>
</table>
</form>
</body>
</html>