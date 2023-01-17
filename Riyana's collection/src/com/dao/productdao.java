package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.product;
import com.sun.mail.iap.Response;
import com.sun.org.apache.bcel.internal.generic.RET;
import com.util.dbutil;

public class productdao {
	public static void addproduct(product p)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "insert into product(uid,category,model,address,image,price) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getUid());
			pst.setString(2, p.getCategory());
			pst.setString(3, p.getModel());
			pst.setString(4, p.getAddress());
			pst.setString(5, p.getImage());
			pst.setInt(6, p.getPrice());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<product> getallproduct()
	{
		List<product> list = new ArrayList<product>();
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "select * from product";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				product p = new product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setCategory(rs.getString("category"));
				p.setModel(rs.getString("model"));
				p.setAddress(rs.getString("address"));
				p.setImage(rs.getString("image"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return list;
	}
	public static product selectproduct(int pid)
	{
		product p =null;
		try
		{
			Connection conn = dbutil.createConnection();
			String sql ="select * from product where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				p = new product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setCategory(rs.getString("category"));
				p.setModel(rs.getString("model"));
				p.setAddress(rs.getString("address"));
				p.setImage(rs.getString("image"));
				p.setPrice(rs.getInt("price"));
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return p;
	}
	public static void updateproduct(product p)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql ="update product set category=?,model=?,address=?,price=? where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getCategory());
			pst.setString(2, p.getModel());
			pst.setString(3, p.getAddress());
			pst.setInt(4, p.getPrice());
			pst.setInt(5, p.getPid());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static void deleteproduct(int pid)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql ="delete from product where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
			
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<product> getbyproductcategory(String category)
	{
		List<product> list = new ArrayList<product>();
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "select * from product where category=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, category);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				product p = new product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setCategory(rs.getString("category"));
				p.setModel(rs.getString("model"));
				p.setAddress(rs.getString("address"));
				p.setImage(rs.getString("image"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return list;
	}
	
}
