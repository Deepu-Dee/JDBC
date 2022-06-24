package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String UpdateData="Update sbi set PhoneNumber=9886993886 where id=8";
		
		try {
			connection=DriverManager.getConnection(url, Username, Password);
			System.out.println("connection is successfull: "+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(UpdateData);
			System.out.println("Data is updated......");
			
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
