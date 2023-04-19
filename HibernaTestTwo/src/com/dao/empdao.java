package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void insertemp(employee e)
	{
		Session session = emputil.createsessSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static List<employee> employeelist()
	{
		Session session = emputil.createsessSession();
		List<employee> list = session.createQuery("from employee").list();
		session.close();
		return list;
	}
	public static employee getbyid(int id)
	{
		Session session = emputil.createsessSession();
		employee e = session.get(employee.class, id);
		session.close();
		return e;
	}
	public static void deleteemp(int id)
	{
		Session session = emputil.createsessSession();
		Transaction tr = session.beginTransaction();
		employee e = session.get(employee.class, id);
		session.delete(e);
		tr.commit();
		session.close();
	}
}
