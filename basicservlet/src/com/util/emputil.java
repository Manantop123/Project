package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class emputil {
	public static Connection createcConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
