package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.user;
import com.dao.userdao;
import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;
import com.service.Services;


/**
 * Servlet implementation class usercontroller
 */
@WebServlet("/usercontroller")
public class usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		// System.out.println(action);
		if (action.equalsIgnoreCase("signup")) {
			boolean flag = userdao.checkemail(request.getParameter("email"));

			if (flag == true) {
				request.setAttribute("msg", "email-id already exist");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else if (request.getParameter("psw").equals(request.getParameter("cpsw"))) {
				user u1 = new user();
				u1.setUsertype(request.getParameter("usertype"));
				u1.setFname(request.getParameter("fname"));
				u1.setEmail(request.getParameter("email"));
				u1.setGender(request.getParameter("gender"));
				u1.setPsw(request.getParameter("psw"));
				u1.setCpsw(request.getParameter("cpsw"));
				userdao.inseruser(u1);
				request.setAttribute("msg", "user saved");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "psw and cpsw doesnot match");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			user u = userdao.checklogin(request.getParameter("email"), request.getParameter("psw"));

			if (u == null) {
				request.setAttribute("msg", "email/psw wrong");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("u", u);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}else if(action.equalsIgnoreCase("changepsw"))
		{
			HttpSession session = request.getSession();
			user u = (user)session.getAttribute("u");
			
			if(u.getPsw().equals(request.getParameter("oldpsw")))
			{
			
				if(request.getParameter("psw").equals(request.getParameter("confirmpsw")))
				{
					userdao.updatepsw(u.getEmail(), request.getParameter("psw"));
					response.sendRedirect("logout.jsp");
				}
				else
				{
					request.setAttribute("msg", "new/cnew is incorrect");
					request.getRequestDispatcher("changepsw.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "old psw is incorrect");
				request.getRequestDispatcher("changepsw.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update profile"))
		{
			user u = new user();
			u.setUid(Integer.parseInt(request.getParameter("uid")));
			u.setFname(request.getParameter("fname"));
			userdao.updateprofile(u);
			HttpSession session = request.getSession();
			session.setAttribute("u", u);
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("sendotp"))
		{
			String email = request.getParameter("email");
			boolean flag = userdao.checkemail(email);
			
			if(flag==true)
			{
				int min = 1000;
				int max = 9999;
				int  otp= (int)Math.floor(Math.random() * (max - min + 1) + min);
				Services.sendMail(email, otp);
				request.setAttribute("email", email);
				request.setAttribute("otp", otp);
				request.setAttribute("msg", "otp sent successfullt");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "email id not register");
				request.getRequestDispatcher("forgotpsw.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify"))
		{
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("updatwpsw.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "otp1 and otp2 are not matched");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("updatepsw"))
		{
			String email = request.getParameter("email");
			String psw = request.getParameter("newpsw");
			String cpsw = request.getParameter("confirmpsw");
			
			if(psw.equals(cpsw))
			{
				userdao.updatepsw(email, psw);
				response.sendRedirect("login.jsp");
			}
			else
			{
				request.setAttribute("msg", "not matched");
				request.getRequestDispatcher("updatwpsw.jsp").forward(request, response);
			}

		}
	}

}
