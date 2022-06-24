package com.project.sbidao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sbiDaoImpl implements sbiDAO {

	@Override
	public void InsertQuery() {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String Query=("Insert into sbi values(11,'Guru','Tiptur',8886247235,1)");
		
		
		try {
			connection=DriverManager.getConnection(url, Username, Password);
			System.out.println("Connection is Successful "+Username);
			Statement statement=connection.createStatement();
			statement.executeUpdate(Query);
			
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

	@Override
	public void UpdateQuery() {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String UpdateData="Update sbi set PhoneNumber=9886993986 where id=8";
		
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

	@Override
	public void ReadSingleData() {
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

	@Override
	public void ReadAllData() {
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

	@Override
	public void DeleteData() {
		String url="jdbc:mysql://localhost:3306/bank";
		String Username="root";
		String Password="Deepu8894*";
		Connection connection=null;
		String DeleteData="Delete from sbi where ID=11";
		
		try {
			connection=DriverManager.getConnection(url, Username, Password);
			System.out.println("connection is successfull: "+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(DeleteData);
			System.out.println("Data is Delete Successfully....");	
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
