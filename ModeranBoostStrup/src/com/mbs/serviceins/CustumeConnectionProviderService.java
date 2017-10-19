package com.mbs.serviceins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.cfg.Environment;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.Configurable;

public class CustumeConnectionProviderService implements ConnectionProvider,Configurable{
	private String Username=null;
	private String Url=null;
	private String driver=null;
	private String password=null;
	@Override
	public boolean isUnwrappableAs(Class arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void configure(Map prop) {
		System.out.println("map");

		driver=(String) prop.get(Environment.DRIVER);
		Url=(String) prop.get(Environment.URL);
		Username=(String) prop.get(Environment.USER);
		password=(String) prop.get(Environment.PASS);
		
		System.out.println(driver);
		
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		System.out.println("close connection");
		if(conn.isClosed()==false)
			conn.close();
		
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn=null;
		System.out.println("get connection()");
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(Url,Username,password);
		}catch(Exception e){
			throw new SQLException(e);
		}
		return conn;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}
}
