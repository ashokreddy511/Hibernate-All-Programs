package com.bs.sessionfactry;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropertiesSessionFactry {
	private static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration.addResource("com/bs/entite/Mechanic.hbm.xml");
		sessionFactory = configuration.buildSessionFactory();
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
