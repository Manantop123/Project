package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.util.emputil;

public class insertemp {
	public static void insertempinfo(EmpInfo e1)
	{
		Session session = emputil.createsSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e1);
		tr.commit();
		session.close();
	}
	
	public static void insertemp(Emp e2)
	{
		Session session = emputil.createsSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e2);
		tr.commit();
		session.close();
	}
}
