package com.mbs.serviceins;

import java.util.Map;

import org.hibernate.boot.registry.StandardServiceInitiator;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;

public class ConnectionServiceInitiator implements StandardServiceInitiator<ConnectionProvider> {

	public Class<ConnectionProvider> getServiceInitiated() {
		return ConnectionProvider.class;
	}
	
	@Override
	public ConnectionProvider initiateService(Map properties, ServiceRegistryImplementor registry) {
		System.out.println("serviceinitiator");
		return new CustumeConnectionProviderService();
	}
}
