package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Emp;
import com.bean.EmpInfo;

public class emputil {
	public static Session createsSession()
	{
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(EmpInfo.class)
				.addAnnotatedClass(Emp.class)
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
