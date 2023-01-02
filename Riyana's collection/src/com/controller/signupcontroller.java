package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.bean.signup;
import com.dao.signupdao;

/**
 * Servlet implementation class signupcontroller
 */
@WebServlet("/signupcontroller")
public class signupcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		// System.out.println(action);
		if (action.equalsIgnoreCase("Submit")) {
			boolean flag = signupdao.selectemail(request.getParameter("email"));

			if (flag == true) {
				request.setAttribute("msg", "email-id already register");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			} else if (request.getParameter("password").equals(request.getParameter("cpassword"))) {
				signup s1 = new signup();
				s1.setFname(request.getParameter("fname"));
				s1.setLname(request.getParameter("lname"));
				s1.setEmail(request.getParameter("email"));
				s1.setGender(request.getParameter("gender"));
				s1.setPassword(request.getParameter("password"));
				s1.setCpassword(request.getParameter("cpassword"));
				s1.setAddress(request.getParameter("address"));
				signupdao.insertemployee(s1);
				request.setAttribute("msg", "saved successfully");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "password doesnot match");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("Login")) {
			signup s = signupdao.loginemp(request.getParameter("email"), request.getParameter("password"));
			if (s == null) {
				request.setAttribute("msg", "login email/password doesnot match");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("s", s);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("psw"))
		{
			HttpSession session = request.getSession();
			signup s = (signup)session.getAttribute("s");
			
			if(s.getPassword().equals(request.getParameter("oldpsw")))
			{
				if(request.getParameter("newpsw").equals(request.getParameter("cnewpsw")))
				{
					signupdao.updatepsw(s.getEmail(), request.getParameter("newpsw"));
					response.sendRedirect("logout.jsp");
				}
				else
				{
					request.setAttribute("msg", "newpsw/cnewpsw doesnot match");
					request.getRequestDispatcher("changepsw.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "old password not matched");
				request.getRequestDispatcher("changepsw.jsp").forward(request, response);
			}
		}
	}

}
