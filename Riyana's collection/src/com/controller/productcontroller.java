package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.Action;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AcceptAction;

import com.bean.product;
import com.dao.productdao;

/**
 * Servlet implementation class productcontroller
 */
@WebServlet("/productcontroller")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512,//512MB
maxFileSize = 1024 * 1024 * 512, //512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB

public class productcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("submit"))
		{
			String savePath = "E:\\Java\\Project\\Riyana's collection\\WebContent\\Product_Images";
			File fileSaveDir=new File(savePath);
	        if(!fileSaveDir.exists()){
	            fileSaveDir.mkdir();
	        }
	        Part file1 = request.getPart("image");
		 	String fileName= extractfilename(file1);
		    file1.write(savePath + File.separator + fileName);
		    String filePath= savePath + File.separator + fileName ;
			product p = new product();
			p.setUid(Integer.parseInt(request.getParameter("uid")));
			p.setCategory(request.getParameter("category"));
			p.setModel(request.getParameter("model"));
			p.setAddress(request.getParameter("address"));
			p.setImage(fileName);
			p.setPrice(Integer.parseInt(request.getParameter("price")));
			productdao.addproduct(p);
			request.setAttribute("msg", "product saved successfully");
			request.getRequestDispatcher("addproduct.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("updateproduct"))
		{
			product p = new product();
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setCategory(request.getParameter("category"));
			p.setModel(request.getParameter("model"));
			p.setAddress(request.getParameter("address"));
			p.setPrice(Integer.parseInt(request.getParameter("price")));
			productdao.updateproduct(p);
			response.sendRedirect("viewproduct.jsp");
		}
	}

}
