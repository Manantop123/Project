package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.dept;
import com.bean.emp;
import com.util.emputil;

public class empdao {
	public static void insertdept(dept d)
	{
		Session session = emputil.createsessSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(d);
		tr.commit();
		session.close();
	}
	
	public static void insertemp(emp e)
	{
		Session session = emputil.createsessSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static List<dept> getallbydept()
	{
		Session session = emputil.createsessSession();
		List<dept> list = session.createQuery("from dept").list();
		session.close();
		return list;
	}
	public static dept getbyid(int id)
	{
		Session session = emputil.createsessSession();
		dept d = session.get(dept.class, id);
		session.close();
		return d;
	}
}
