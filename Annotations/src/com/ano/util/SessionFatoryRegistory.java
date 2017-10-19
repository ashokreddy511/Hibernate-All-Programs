package com.ano.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFatoryRegistory {
	private static SessionFactory sessionFactory;
	static{
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistry repositry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).configure().build();
		sessionFactory =configuration.buildSessionFactory(repositry);
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void closeSessionFactory(){
		if(sessionFactory!=null){
			sessionFactory.close();
		}
		sessionFactory=null;
	}
}
