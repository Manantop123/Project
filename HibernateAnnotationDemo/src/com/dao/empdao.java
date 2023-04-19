package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void inseremp(employee e)
	{
		Session session = emputil.createseSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	
	public static List<employee> listOfEmployee()
	{
		Session session = emputil.createseSession();
		List<employee> list = session.createQuery("from employee").list();
		session.close();
		return list;
	}
	
	public static employee getbyid(int id)
	{
		Session session = emputil.createseSession();
		employee e = session.get(employee.class, id);
		session.close();
		return e;
	}
	
	public static void deletemep(int id)
	{
		Session session = emputil.createseSession();
		Transaction tr = session.beginTransaction();
		employee e = session.get(employee.class, id);
		session.delete(e);
		tr.commit();
		session.close();
	}
}
