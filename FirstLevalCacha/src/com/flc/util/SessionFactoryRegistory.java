package com.flc.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {
	private static SessionFactory sessionFactory = null;

	static {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistry registory = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(registory);
	}

	/**
	 * @return the sessionfactory
	 */
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	public static void closeSessionfactory(){
		if(sessionFactory!=null){
			sessionFactory.close();
		}
	}
}
