package com.cs.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {
	private static SessionFactory sessionFactory;
	public static ThreadLocal<Session> threadLocal;
	static {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(registry);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*public static Session getSession() {
		//threadlocalsessioncontext
		 *jta
		 *managed
		if(threadLocal.get()==null){
		Session session=sessionFactory.openSession();
		threadLocal.set(session);
		}
		return threadLocal.get();
	}*/

}
