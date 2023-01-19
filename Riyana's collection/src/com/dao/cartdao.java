package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.cart;
import com.bean.wishlist;
import com.util.dbutil;

public class cartdao {
	public static void addcart(cart c)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "insert into cart(pid,uid,productqty,productprice,producttprice) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getUid());
			pst.setInt(3, c.getProductqty());
			pst.setInt(4, c.getProductprice());
			pst.setInt(5, c.getProducttprice());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<cart> getbyproductbyid(int uid)
	{
		List<cart> list = new ArrayList<cart>();
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "select * from cart where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				cart c = new cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setProductqty(rs.getInt("productqty"));
				c.setProductprice(rs.getInt("productprice"));
				c.setProducttprice(rs.getInt("producttprice"));
				list.add(c);
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return list;
	}
	public static boolean checkcartlist(int uid,int pid)
	{
		boolean flag = false;
		try
		{
			Connection conn = dbutil.createConnection();
			String sql ="select * from cart where uid=? and pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				flag=true;
			}
		}
		catch (Exception e2) {
			e2.printStackTrace();
		}
		return flag;
	}
	public static void deletecart(cart c)
	{
		try
		{
		Connection conn = dbutil.createConnection();
		String sql ="delete from cart where pid=? and uid=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, c.getPid());
		pst.setInt(2, c.getUid());
		pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}

}
