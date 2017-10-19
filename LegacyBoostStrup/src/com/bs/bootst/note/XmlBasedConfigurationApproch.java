package com.bs.bootst.note;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlBasedConfigurationApproch {
	public static void main(String[] args) {
		// src/.cfg.xml ment for store the file in to of the classpath
		// Configuration configuration=new Configuration().configure();
		// to load the .cfg.xml from classpath(every time it load in
		// sys/application class loader only.

		Configuration configuration = new Configuration()
				.configure("hibernate.cfg.xml");
		// we can give any name for .cfg.xml file and place the any where in the
		// src and it sub directory but
		// we can pass the parameter as the configure
		SessionFactory sessionfactory = configuration.buildSessionFactory(); // core
																				// part
																				// in
																				// hibernate
		// validate the mapping and .cfg file information
	}
}
