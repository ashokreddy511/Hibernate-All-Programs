package com.mbs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import com.mbs.service.CustumeConnectionProviderServiceImpl;

public class ServiceTest {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		
		 /* StandardServiceRegistryBuilder ssrb=new
		  StandardServiceRegistryBuilder();
		  ssrb.addService(ConnectionProvider.class,new
		  CustumeConnectionProviderServiceImpl()); StandardServiceRegistry
		  ssr=ssrb.build();*/
		 
		StandardServiceRegistry ssr = (StandardServiceRegistry) new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.addService(ConnectionProvider.class,
						new CustumeConnectionProviderServiceImpl()).build();

		SessionFactory factory = configuration.buildSessionFactory(ssr);
		Session session = factory.openSession();
		session.close();
		factory.close();
	}
}
