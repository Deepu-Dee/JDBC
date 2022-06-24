package com.project.sbi.connectionprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionProvider {
	private static Connection connection=null; 
	
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Deepu8894*");
			System.out.println("connection is successfull....");
			System.out.println("connection is singleton......");
		}
		catch(SQLException exception) {
			System.out.println(exception.getMessage());
			
	}
	}
	public static Connection getconnection() {
		if(connection!=null) {
		return connection;	
	}
		else {
			System.out.println("Connection is not Established");
			return connection;
		}
	}
	public static void  closeconnection() {
		if(connection!=null) {
			System.out.println("connection is closed");
		}
		else {
			System.out.println("Connection is not closed");
		
}
	}
}
	
