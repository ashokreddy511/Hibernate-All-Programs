package com.idg.util;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionfactory() {

		if (sessionfactory == null) {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionfactory = configuration.buildSessionFactory(registry);
		}

		return sessionfactory;
	}
	
	public static void closeSessionFactory(){
		if(sessionfactory!=null){
			sessionfactory.close();
			sessionfactory=null;
			
		}
	}

}
