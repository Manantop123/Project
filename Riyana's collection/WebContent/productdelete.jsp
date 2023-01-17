<%@page import="com.dao.productdao"%>
<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	productdao.deleteproduct(pid);
	response.sendRedirect("viewproduct.jsp");
%>