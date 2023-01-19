<%@page import="com.dao.wishlidtdao"%>
<%@page import="com.bean.wishlist"%>
<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	int uid = Integer.parseInt(request.getParameter("uid"));
	
	wishlist w = new wishlist();
	w.setPid(pid);
	w.setUid(uid);
	wishlidtdao.addproduct(w);
	response.sendRedirect("mywishlist.jsp");
%>