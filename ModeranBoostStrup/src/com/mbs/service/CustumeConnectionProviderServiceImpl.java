package com.mbs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class CustumeConnectionProviderServiceImpl implements ConnectionProvider{

	@Override
	public boolean isUnwrappableAs(Class arg0) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		if(!conn.isClosed()){
			System.out.println("this from closeConnection");
			conn.close();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn=null;
		System.out.println("msg from getconnection");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile","root","root");
			
		}catch(Exception e){
			e.printStackTrace();;
		}
		return conn;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}

}
