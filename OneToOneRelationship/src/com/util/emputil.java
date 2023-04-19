package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.emp;
import com.bean.empinfo;

public class emputil {
	public static Session createsSession()
	{
		SessionFactory sf = new Configuration().addAnnotatedClass(empinfo.class).addAnnotatedClass(emp.class).configure().buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
