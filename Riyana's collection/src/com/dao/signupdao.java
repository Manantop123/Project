package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.signup;

import com.util.dbutil;

public class signupdao {
	public static void insertemployee(signup s1)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "insert into signup(fname,lname,email,gender,password,cpassword,address,usertype) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s1.getFname());
			pst.setString(2, s1.getLname());
			pst.setString(3, s1.getEmail());
			pst.setString(4, s1.getGender());
			pst.setString(5, s1.getPassword());
			pst.setString(6, s1.getCpassword());
			pst.setString(7, s1.getAddress());
			pst.setString(8, s1.getUsertype());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static boolean selectemail(String email)
	{
		boolean flag = false;
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "select * from signup where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				flag = true;
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return flag;
	}
	public static signup loginemp(String email, String password)
	{
		signup s1 = null;
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "select * from signup where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				s1 = new signup();
				s1.setUid(rs.getInt("uid"));
				s1.setFname(rs.getString("fname"));
				s1.setLname(rs.getString("lname"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
				s1.setCpassword(rs.getString("cpassword"));
				s1.setGender(rs.getString("gender"));
				s1.setAddress(rs.getString("address"));
				s1.setUsertype(rs.getString("usertype"));
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return s1;
	}
	public static void updatepsw(String email , String psw)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "update signup set password=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, psw);
			pst.setString(2, email);
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static void updateform(signup s1)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql ="update signup set fname=?,lname=?,address=?,usertype=? where email=?";		
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s1.getFname());
			pst.setString(2, s1.getLname());
			pst.setString(3, s1.getAddress());
			pst.setString(4, s1.getEmail());
			pst.setString(5, s1.getUsertype());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
