package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.emp;
import com.bean.empinfo;
import com.dao.empdao;

/**
 * Servlet implementation class empcontroller
 */
@WebServlet("/empcontroller")
public class empcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			empinfo ef = new empinfo();
			ef.setFname(request.getParameter("fname"));
			ef.setLname(request.getParameter("lname"));
			ef.setGender(request.getParameter("gender"));
			empdao.insertempinfo(ef);
			
			emp e1 = new emp();
			e1.setJob(request.getParameter("job"));
			e1.setSalary(Double.parseDouble(request.getParameter("salary")));
			empdao.insertemp(e1);
			response.sendRedirect("show.jsp");
		}
	}

}
