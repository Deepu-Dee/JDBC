package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/bank";
	String Username="root";
	String Password="Deepu8894*";
	Connection connection=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url, Username, Password);
		System.out.println("Connection is Successful "+url);
	}
	catch(SQLException exception) {
		System.out.println("Connection is Failed "+exception.getMessage());
		
	}
	finally {
		if(connection!=null) {
			System.out.println("Connection is closed");
			connection.close();
		}
		else {
			System.out.println("Connection is not closed");
		}
	}
	
		
}
	
	}
