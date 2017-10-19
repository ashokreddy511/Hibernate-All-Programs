package com.mbs.test5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

import com.mbs.service5.CustumeConnectionService;

public class MBSTest {
	public static void main(String[] args) {
		StandardServiceRegistry repositry = new StandardServiceRegistryBuilder()
				.addService(ConnectionProvider.class,
						new CustumeConnectionService()).build();
		MetadataSources metadataSoruces=new MetadataSources(repositry);
		Metadata metadata=metadataSoruces.buildMetadata();
		SessionFactory factory=metadata.buildSessionFactory();
		Session session=factory.openSession();
		session.close();
		factory.close();
	}
}
