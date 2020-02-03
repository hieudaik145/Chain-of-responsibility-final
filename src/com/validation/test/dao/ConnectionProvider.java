package com.validation.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://localhost:/datawirehouse_test?useUnicode=yes&characterEncoding=UTF-8";
	private static final String User="root";
	private static final String Pass="";
	
	private static Connection con = null;

	static {

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(DB_URL, User, Pass);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
