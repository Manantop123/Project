package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.employee;
import com.dao.empdao;

/**
 * Servlet implementation class employeecontroller
 */
@WebServlet("/employeecontroller")
public class employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			employee e = new employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(Long.parseLong(request.getParameter("mobile")));
			e.setGender(request.getParameter("gender"));
			e.setAddress(request.getParameter("address"));
			empdao.insertemployee(e);
			response.sendRedirect("Frontend.jsp");
//			System.out.println(request.getParameter("fname"));
//			System.out.println(request.getParameter("lname"));
//			System.out.println(request.getParameter("email"));
//			System.out.println(request.getParameter("mobile"));
//			System.out.println(request.getParameter("gender"));
//			System.out.println(request.getParameter("address"));
		}
	}

}
