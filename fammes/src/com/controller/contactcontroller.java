package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.contact;
import com.dao.contactdao;

/**
 * Servlet implementation class contactcontroller
 */
@WebServlet("/contactcontroller")
public class contactcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String action = request.getParameter("action");
			//System.out.println("action");
			
			if(action.equalsIgnoreCase("submit"))
			{
				contact c1 = new contact();
				c1.setFname(request.getParameter("fname"));
				c1.setEmail(request.getParameter("email"));
				c1.setSubject(request.getParameter("subject"));
				c1.setMsg(request.getParameter("msg"));
				contactdao.insertcontact(c1);
				request.setAttribute("msg", "contact saved");
				request.getRequestDispatcher("contact.jsp").forward(request, response);
			}
	}

}
