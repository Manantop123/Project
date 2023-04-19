<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%-- page directve tag --%>   
 <%@include file = "index2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp file</title>
</head>
<body>

<%-- script tag --%>
<%
	int a=5,b=6;

	if(a>b)
	{
%>		
		<b>"a is greater"</b>
<% 		
	}
	else
	{
%>		
		"b is greater";
<% 
	}
%>

<%-- regular expression is used for import data from database --%>
<%= %>
</body>
</html>