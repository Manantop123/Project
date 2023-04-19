package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.dept;
import com.bean.emp;
import com.dao.empdao;

/**
 * Servlet implementation class employeecontroller
 */
@WebServlet("/employeecontroller")
public class employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("add dept"))
		{
			dept d = new dept();
			d.setD_name(request.getParameter("dname"));
			d.setD_loc(request.getParameter("d_location"));
			empdao.insertdept(d);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("add emp"))
		{
			emp e = new emp();
			e.setE_name(request.getParameter("fname"));
			e.setDesig(request.getParameter("design"));
			int did = Integer.parseInt(request.getParameter("dept"));
			dept d = empdao.getbyid(did);
			e.setDept(d);
			empdao.insertemp(e);
			response.sendRedirect("show.jsp");
		}
	}

}
