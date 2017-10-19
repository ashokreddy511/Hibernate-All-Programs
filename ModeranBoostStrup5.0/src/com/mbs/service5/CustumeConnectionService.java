package com.mbs.service5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class CustumeConnectionService implements ConnectionProvider {

	@Override
	public boolean isUnwrappableAs(Class arg0) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		return null;
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		System.out.println("closed connection");
		if (!conn.isClosed()) {
			conn.close();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn;
		System.out.println("getconetion");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/automobile", "root", "root");
		} catch (Exception e) {
			throw new SQLException(e);
		}

		return conn;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}

}
