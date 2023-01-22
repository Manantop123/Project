package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.cart;
import com.dao.cartdao;

/**
 * Servlet implementation class cartcontroller
 */
@WebServlet("/cartcontroller")
public class cartcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid= Integer.parseInt(request.getParameter("cid"));
		int product_qty = Integer.parseInt(request.getParameter("product_qty"));
		
		cart c = cartdao.selectproduct(cid);
		c.setProductqty(product_qty);
		int total_price = c.getProductprice()*product_qty;
		c.setTotalprice(total_price);
		cartdao.updatecart(c);
		//System.out.println(cid);
		//System.out.println(product_qty);
		response.sendRedirect("mycart.jsp");
	}

}
