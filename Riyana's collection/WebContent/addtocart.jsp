<%@page import="com.dao.productdao"%>
<%@page import="com.dao.cartdao"%>
<%@page import="com.bean.product"%>
<%@page import="com.bean.cart"%>
<%@page import="com.dao.wishlidtdao"%>
<%@page import="com.bean.wishlist"%>
<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	int uid = Integer.parseInt(request.getParameter("uid"));
	
	cart c = new cart();
	product p = productdao.selectproduct(pid);
	c.setPid(pid);
	c.setUid(uid);
	c.setProductqty(1);
	c.setProductprice(p.getPrice());
	c.setTotalprice(p.getPrice());
	cartdao.addcart(c);
	response.sendRedirect("mycart.jsp");
%>