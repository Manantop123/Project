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
import com.service.Services;

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
				s1.setUsertype(request.getParameter("usertype"));
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
		else if(action.equalsIgnoreCase("update"))
		{
			signup s1 = new signup();
			s1.setUid(Integer.parseInt(request.getParameter("uid")));
			s1.setFname(request.getParameter("fname"));
			s1.setLname(request.getParameter("lname"));
			s1.setEmail(request.getParameter("email"));
			s1.setAddress(request.getParameter("address"));
			signupdao.updateform(s1);
			HttpSession session = request.getSession();
			session.setAttribute("s1", s1);
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("sendotp"))
		{
			String email = request.getParameter("email");
			boolean flag = signupdao.selectemail(email);
			if(flag==true)
			{
				int min = 1000;
				int max = 9999;
				int  otp= (int)Math.floor(Math.random() * (max - min + 1) + min);
				Services.sendMail(email, otp);
				request.setAttribute("email",email);
				request.setAttribute("otp", otp);
				request.setAttribute("msg", "otp send successfully");
				request.getRequestDispatcher("otp.jsp").forward(request,response);

			}
			else
			{
				request.setAttribute("msg", "email-id is not register");
				request.getRequestDispatcher("forgotpsw.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verifyotp"))
		{
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("updatepsw.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "invalid otp");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("updatepsw"))
		{
			String email = request.getParameter("email");
			String np = request.getParameter("newpsw");
			String cnp = request.getParameter("cnewpsw");
			
			if(np.equals(cnp))
			{
				signupdao.updatepsw(email, np);
				response.sendRedirect("login.jsp");
			}
			else
			{
				request.setAttribute("email", email);
				request.setAttribute("msg", "new psw / cpsw doesnot match");
				request.getRequestDispatcher("updatepsw.jsp").forward(request, response);
			}
		}
	}
}
