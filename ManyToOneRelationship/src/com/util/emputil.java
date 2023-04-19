package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.dept;
import com.bean.emp;

public class emputil {
	public static Session createsessSession()
	{
		SessionFactory sf = new Configuration().
								addAnnotatedClass(dept.class).
								addAnnotatedClass(emp.class).
								configure().
								buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
