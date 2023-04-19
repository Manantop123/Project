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
			e.setEname(request.getParameter("fname"));
			e.setElname(request.getParameter("lname"));
			e.setGender(request.getParameter("gender"));
			empdao.insertemp(e);
			response.sendRedirect("show.jsp");
		}
		
		else if(action.equalsIgnoreCase("edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			employee e = empdao.getbyid(id);
			request.setAttribute("e", e);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("update"))
		{
			employee e = new employee();
			e.setEid(Integer.parseInt(request.getParameter("id")));
			e.setEname(request.getParameter("fname"));
			e.setElname(request.getParameter("lname"));
			e.setGender(request.getParameter("gender"));
			empdao.insertemp(e);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			empdao.deleteemp(id);
			response.sendRedirect("show.jsp");
		}
	}

}
