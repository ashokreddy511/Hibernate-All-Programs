package com.idg.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistroy {
	static SessionFactory SessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (SessionFactory == null) {
			Configuration configuration = new Configuration()
					.configure("com/idg/util/hibernate.cfg.xml");
			StandardServiceRegistry registory = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			SessionFactory = configuration.buildSessionFactory(registory);
		}

		return SessionFactory;
	}
	public static void closeSessionFactory(){
		if (SessionFactory != null) {
			SessionFactory.close();
			SessionFactory = null;
		}
	}

}
