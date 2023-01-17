package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.contact;
import com.util.dbutil;

public class contactdao {
	public static void insertcontact(contact c1)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "insert into contact(fname,email,subject,msg) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c1.getFname());
			pst.setString(2, c1.getEmail());
			pst.setString(3, c1.getSubject());
			pst.setString(4, c1.getMsg());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
