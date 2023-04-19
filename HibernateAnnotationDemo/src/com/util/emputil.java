package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.employee;

public class emputil {
	public static Session createseSession()
	{
		SessionFactory sf = new Configuration().
								addAnnotatedClass(employee.class).
								configure().
								buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}	
