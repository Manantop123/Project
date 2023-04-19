package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.employee;
import com.mysql.jdbc.PreparedStatement;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e)
	{
		try
		{
			Connection conn = emputil.createcConnection();
			String sql = "insert into employee(fname,lname,email,mobile,gender,address) values(?,?,?,?,?,?)";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getGender());
			pst.setString(6, e.getAddress());
			pst.executeUpdate();
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public static List<employee> getallemployee()
	{
		List<employee> list = new ArrayList<employee>();
		try
		{
			Connection conn = emputil.createcConnection();
			String sql = "select * from employee";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				employee e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setGender(rs.getString("gender"));
				e.setAddress(rs.getString("address"));
				list.add(e);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}	
}
