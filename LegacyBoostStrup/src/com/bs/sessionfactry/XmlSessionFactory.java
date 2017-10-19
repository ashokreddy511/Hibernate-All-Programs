package com.bs.sessionfactry;

import javax.transaction.Synchronization;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlSessionFactory {
	//public static XmlSessionFactory instance;
	public static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration().configure("com/bs/common/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void getCloseSessionFactory(){
		if(sessionFactory!=null){
			sessionFactory.close();
		}
	}
}
