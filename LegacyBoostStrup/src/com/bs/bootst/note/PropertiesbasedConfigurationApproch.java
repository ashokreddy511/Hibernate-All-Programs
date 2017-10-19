package com.bs.bootst.note;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropertiesbasedConfigurationApproch {
	public static void main(String[] args) {
		

		Configuration configuration = new Configuration();
		configuration.addResource("hibernate.properties");
		
		//the default costructor [new configuration() ] check for hibernate.properties, it doesn't contains 
		// overloaded constructors
		// we cannot give any name for hibernate.properties file and it place only in src folder only.
		// if cannot provide the mapping file information in properties file
		
		SessionFactory sessionfactory = configuration.buildSessionFactory(); // core
																				// part
																				// in
																				// hibernate
		// validate the mapping and .cfg file information
	}
}
