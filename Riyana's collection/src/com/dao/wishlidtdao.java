package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.bean.product;
import com.bean.wishlist;
import com.util.dbutil;

public class wishlidtdao {
	public static void addproduct(wishlist w)
	{
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "insert into wishlist(pid,uid) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getUid());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<wishlist> getbyproductbyid(int uid)
	{
		List<wishlist> list = new ArrayList<wishlist>();
		try
		{
			Connection conn = dbutil.createConnection();
			String sql = "select * from wishlist where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				wishlist w = new wishlist();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				w.setUid(rs.getInt("uid"));
				list.add(w);
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return list;
	}
	
	public static boolean checkwishlist(int uid,int pid)
	{
		boolean flag = false;
		try
		{
			Connection conn = dbutil.createConnection();
			String sql ="select * from wishlist where uid=? and pid=?";
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
	public static void deletewishlist(wishlist w)
	{
		try
		{
		Connection conn = dbutil.createConnection();
		String sql ="delete from wishlist where pid=? and uid=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, w.getPid());
		pst.setInt(2, w.getUid());
		pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
