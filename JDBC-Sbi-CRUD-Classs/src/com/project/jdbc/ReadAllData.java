package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadAllData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String ReadAllData="select * from sbi";
		
		try {
			connection=DriverManager.getConnection(url, Username, Password);
			System.out.println("Connection is Successful "+Username);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(ReadAllData);
			while(resultset.next()) {
				System.out.println("ID: "+resultset.getInt(1));
				System.out.println("Manager Name: "+resultset.getString(2));
				System.out.println("Place: "+resultset.getString(3));
				System.out.println("Phone Number: "+resultset.getString(4));
				System.out.println("Are They Provide Housing Loan: "+resultset.getBoolean(5));
				System.out.println("*****************");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
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
