package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.contact;
import com.dao.contactdao;
import com.util.dbutil;

/**
 * Servlet implementation class contactcontroller
 */
@WebServlet("/contactcontroller")
public class contactcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Submit"))
		{
			contact c = new contact();
			c.setFname(request.getParameter("fname"));
			c.setEmail(request.getParameter("email"));
			c.setSubject(request.getParameter("subject"));
			c.setMessage(request.getParameter("message"));
			contactdao.insertcontact(c);
			request.setAttribute("msg", "saved successfully");
			request.getRequestDispatcher("contact.jsp").forward(request, response);
		}
	}

}
