package com.util;

import java.lang.module.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {

	
	private static SessionFactory sessionfactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student.class);
			sessionfactory = cfg.beginSessionFactory();
			return sessionfactory;
			
			
		}
		
	}
	
}
