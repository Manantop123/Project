<%@page import="com.dao.cartdao"%>
<%@page import="com.bean.cart"%>
<%@page import="com.dao.wishlidtdao"%>
<%@page import="com.bean.wishlist"%>
<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	int uid = Integer.parseInt(request.getParameter("uid"));
	
	cart c = new cart();
	c.setPid(pid);
	c.setUid(uid);
	cartdao.deletecart(c);
	response.sendRedirect("mycart.jsp");
%>