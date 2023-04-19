package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.dao.insertemp;

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
			EmpInfo e1 = new EmpInfo();
			e1.setFname(request.getParameter("fname"));
			e1.setLname(request.getParameter("lname"));
			e1.setEmail(request.getParameter("email"));
			insertemp.insertempinfo(e1);
			
			Emp e2 = new Emp();
			e2.setJob(request.getParameter("job"));
			e2.setSalary(Double.parseDouble(request.getParameter("salary")));
			e2.setEinfo(e1);
			insertemp.insertemp(e2);
			response.sendRedirect("index.jsp");
		}
	
	}

}
