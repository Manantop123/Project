package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.xml.ws.Response;

import com.bean.contact;

import com.util.dbutil;

public class contactdao {
	public static void insertcontact(contact c)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "insert into contact(fname,email,subject,message) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getFname());
			pst.setString(2, c.getEmail());
			pst.setString(3, c.getSubject());
			pst.setString(4, c.getMessage());
			pst.executeUpdate();
			
			
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
