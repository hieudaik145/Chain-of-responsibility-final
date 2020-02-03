package com.validation.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilService {

	public static void createProcedure(Connection conn, String query) {

		try {
			Statement statement = conn.createStatement();
			statement.execute(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean checkProcedureExist(Connection con, String procedureName) {
		boolean exists = false;
		String query = "SELECT IF( COUNT(ROUTINE_NAME) = 0, 'F' , 'T' ) AS ProcedureExists " + 
				"FROM INFORMATION_SCHEMA.ROUTINES " + 
				"WHERE ROUTINE_SCHEMA = 'datawirehouse_test' " + 
				"AND ROUTINE_TYPE = 'PROCEDURE' " + 
				"AND UCASE(ROUTINE_NAME) = UCASE('" + procedureName + "')";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.execute();
			ResultSet rs = preparedStatement.executeQuery();
			rs.next();
			String procedureExists = rs.getString(1);
			if(procedureExists.equals("T")) {
				exists =  true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exists;
	}
}
