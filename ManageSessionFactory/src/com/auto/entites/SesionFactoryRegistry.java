package com.auto.entites;

import java.sql.SQLException;

import javax.transaction.Synchronization;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SesionFactoryRegistry {
	public static SessionFactory sessionFactory;
	static{
		try{
		//OPTIMIZATION CODE
			Configuration configuration=new Configuration().configure();
			sessionFactory=configuration.buildSessionFactory();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static SessionFactory getcreate(){
		
		/*if(sessionFactory==null){
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionfactiry=configuration.buildSessionFactory();
		}*/
		return sessionFactory;
	}
	public static void setSessionFactory(SessionFactory sessionFactory) {
		SesionFactoryRegistry.sessionFactory = sessionFactory;
	}
	public static void close(){
		sessionFactory.close();
	}

}
