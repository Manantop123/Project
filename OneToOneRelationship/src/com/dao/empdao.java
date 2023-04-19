package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.emp;
import com.bean.empinfo;
import com.util.emputil;

public class empdao {
	public static void insertempinfo(empinfo ef)
	{
		Session session = emputil.createsSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(ef);
		tr.commit();
		session.close();
	}
	
	public static void insertemp(emp emp)
	{
		Session session = emputil.createsSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(emp);
		tr.commit();
		session.close();
	}
}
