package com.cognixia.jump.util.db;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ConnectionManager { 
	private static Connection sqlConnection = null;
	private ConnectionManager() {}
	public static Connection getConnection() {
		Properties properties = new Properties();
		File file = new File("resources\\config.properties");
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			properties.load(inputStream);
			Class.forName(properties.getProperty("driver"));
			sqlConnection = DriverManager.getConnection
					(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	return sqlConnection; 
    }
 
	public static boolean testConnection() {
		boolean connected = false;
		Statement statement = null;
		ResultSet resultSet = null;
		Set<String> expectedTables = new HashSet<String>(Arrays.asList(new String[] {"user", "animal", "location"}));
		List<String> tableNames = new ArrayList<String>();
		try {
			sqlConnection = ConnectionManager.getConnection();
			statement = sqlConnection.createStatement();
			resultSet =  statement.executeQuery("show tables");
			while(resultSet.next()) {
				tableNames.add(resultSet.getString(1));
			}
			Set<String> actualTables = new HashSet<String>(tableNames);
			if(actualTables.containsAll(expectedTables)) {
				System.out.println("Connection was succesful!\n");
				System.out.println("Inside Database containing the following tables:");
				for(String table: actualTables) {
					System.out.println(table);
				}	System.out.println();
			}	
			
		} catch (SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}	finally {
			try {
				resultSet.close();
				statement.close();
				sqlConnection.close();
				if(sqlConnection.isClosed()) {
					System.out.println("Connection is now closed!");
				}	return !connected;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	return connected;
	}
}
