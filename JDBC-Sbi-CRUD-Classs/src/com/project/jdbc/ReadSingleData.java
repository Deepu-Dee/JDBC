package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadSingleData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String ReadSingleData="select * from sbi where id=5";
		
		
		try {
			connection=DriverManager.getConnection(url, Username, Password);
			System.out.println("Connection is Successful "+Username);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(ReadSingleData);
			resultset.next();
			System.out.println("ID: "+resultset.getInt(1));
			System.out.println("Manager Name: "+resultset.getString(2));
			System.out.println("Place: "+resultset.getString(3));
			System.out.println("Phone Number: "+resultset.getString(4));
			System.out.println("Are They Provide Housing Loan: "+resultset.getBoolean(5));
			System.out.println("Data inserted Succesfully......");
		}
		catch(Exception e) {
			System.out.println("Connection is Failed: "+e.getMessage());
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
