package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbutil {
	
	public static Connection createConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return conn;
	}
}
