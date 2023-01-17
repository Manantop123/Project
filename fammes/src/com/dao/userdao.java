package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.user;
import com.util.dbutil;

public class userdao {
	public static void inseruser(user u1) {
		try {
			Connection conn = dbutil.createConnection();
			String sql = "insert into user(usertype,fname,email,gender,psw,cpsw) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u1.getUsertype());
			pst.setString(2, u1.getFname());
			pst.setString(3, u1.getEmail());
			pst.setString(4, u1.getGender());
			pst.setString(5, u1.getPsw());
			pst.setString(6, u1.getCpsw());
			pst.executeUpdate();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public static boolean checkemail(String email) {
		boolean flag = false;
		try {
			Connection conn = dbutil.createConnection();
			String sql = "select * from user where email =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return flag;
	}

	public static user checklogin(String email, String psw) {
		user u = null;
		try {
			Connection conn = dbutil.createConnection();
			String sql = "select * from user where email=? and psw=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, psw);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				u = new user();
				u.setUid(rs.getInt("uid"));
				u.setFname(rs.getString("fname"));
				u.setEmail(rs.getString("email"));
				u.setGender(rs.getString("gender"));
				u.setPsw(rs.getString("psw"));
				u.setCpsw(rs.getString("cpsw"));
				u.setUsertype(rs.getString("usertype"));
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return u;
	}
	public static void updatepsw(String email, String psw)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "update user set psw=? where email=?";
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
	public static void updateprofile(user u)
	{
		try
		{
			Connection conn  = dbutil.createConnection();
			String sql ="update user set fname=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		
	}
}
