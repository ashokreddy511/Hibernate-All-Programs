package com.bs.sessionfactry;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgramaicSessionFactory {
	private static SessionFactory sessionFactory;
	private static Properties prop = null;
	static {
		try {
			prop = new Properties();
			prop.load(ProgramaicSessionFactory.class.getClassLoader()
					.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Configuration configuration = new Configuration();
		configuration.setProperty("hibernate.connection.driver_class",
				prop.getProperty("driver_class"));
		configuration.setProperty("hibernate.connection.url",
				prop.getProperty("url"));
		configuration.setProperty("hibernate.connection.username",
				prop.getProperty("username"));
		configuration.setProperty("hibernate.connection.password",
				prop.getProperty("password"));
		configuration.setProperty("hibernate.dialect",
				prop.getProperty("dialect"));
		configuration.setProperty("hibernate.show_sql",
				prop.getProperty("show"));
		configuration.addResource("com/bs/entite/Mechanic.hbm.xml");

		sessionFactory = configuration.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionfactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
		sessionFactory = null;
	}
}
