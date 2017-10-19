package com.mbs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mbs.serviceins.ConnectionServiceInitiator;

public class InitiatorTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		  StandardServiceRegistryBuilder ssrb=new
		  StandardServiceRegistryBuilder();
		  ssrb.applySettings(configuration.getProperties());
		  ssrb.addInitiator(new ConnectionServiceInitiator()); 
		  StandardServiceRegistry ssr=ssrb.build();
		SessionFactory factory = configuration.buildSessionFactory(ssr);
		Session session = factory.openSession();
		session.close();
		factory.close();
	}
}
