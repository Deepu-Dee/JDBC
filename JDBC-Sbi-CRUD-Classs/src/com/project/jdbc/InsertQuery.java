package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String Query=("Insert into sbi values(8,'Guru','Tiptur',8886247235,1)");
		String Query1=("Insert into sbi values(9,'Kavya','Kunigal',8886247235,0)");
		String Query2=("Insert into sbi values(10,'Roopa','Dabaspete',9980369435,1)");
		String Query3=("Insert into sbi values(11,'Ganesh','Sira',8886247235,0)");
		
		try {
			connection=DriverManager.getConnection(url, Username, Password);
			System.out.println("Connection is Successful "+Username);
			Statement statement=connection.createStatement();
			statement.executeUpdate(Query);
			statement.executeUpdate(Query1);
			statement.executeUpdate(Query2);
			statement.executeUpdate(Query3);
			System.out.println("Data is Inserted Successfully...");
			
		}
		catch(SQLException exception) {
			System.out.println("Connection is failed "+exception.getMessage());
			System.out.println("Data is Not Inserted Successfully...");
			
		}
		finally {
			if(connection!=null) {
				System.out.println("Connection is closed");
				
			}
			else {
				System.out.println("Connection is not closed");
			}
	}
	}

}
