
<%
	session.removeAttribute("s");
	session.invalidate();
	response.sendRedirect("login.jsp");
%>


