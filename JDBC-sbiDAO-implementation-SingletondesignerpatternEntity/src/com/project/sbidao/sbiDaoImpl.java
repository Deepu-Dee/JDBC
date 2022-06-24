package com.project.sbidao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.sbi.connectionprovider.connectionProvider;
import com.project.sbi.entity.Sbi;

public class sbiDaoImpl implements sbiDAO {

	@Override
	public void InsertQuery(Sbi sbi) {
		System.out.println("Involked Sbi Insert data()");
		String InsertQuery="Insert into Sbi Values(?,?,?,?,?)";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(InsertQuery);
			prepareStatement.setInt(1, sbi.getId());
			prepareStatement.setString(2, sbi.getManagerName());
			prepareStatement.setString(3, sbi.getPlace());
			prepareStatement.setLong(4, sbi.getPhoneNumber());
			prepareStatement.setBoolean(5, sbi.isAreTheyProvideHousingLoan());
			
			prepareStatement.executeUpdate();
			System.out.println("Data is Inserted Successfully");
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
		}
	}

	@Override
	public void UpdateQuery(Sbi sbi) {
		System.out.println("Involked Sbi Update Data()");
		String UpdateQuery="Update Sbi set PhoneNumber=? where Id=?";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(UpdateQuery);
			prepareStatement.setLong(1, sbi.getPhoneNumber());
			prepareStatement.setInt(2, sbi.getId());
			
			prepareStatement.executeUpdate();
			System.out.println("Data is Updated Successfully");
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
		}
		
	}

	@Override
	public void ReadSingleData(Sbi sbi) {
		System.out.println("Involked Sbi ReadSingle Data()");
		String ReadSingleData="select * from Sbi Where Id=?";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(ReadSingleData);
			prepareStatement.setInt(1, sbi.getId());
			ResultSet resultset=prepareStatement.executeQuery();
			resultset.next();
				System.out.println("ID "+prepareStatement.getResultSet().getInt(1));
				System.out.println("Manager Name "+prepareStatement.getResultSet().getString(2));
				System.out.println("Place "+prepareStatement.getResultSet().getString(3));
				System.out.println("Phone Number "+prepareStatement.getResultSet().getLong(4));
				System.out.println("IS HousingLoan Available "+prepareStatement.getResultSet().getBoolean(5));
				System.out.println("*********");
				
			
//			prepareStatement.executeUpdate();
			System.out.println("Read Single data Successfully");
			
		
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
			
		}
	
		
	}

	@Override
	public void ReadAllData(Sbi sbi) {
		System.out.println("Involked Sbi ReadAll Data()");
		String ReadAllData="select * from Sbi";
		
		try {
			Connection connection=connectionProvider.getconnection();
			Statement statement=connection.createStatement();
			PreparedStatement prepareStatement=connection.prepareStatement(ReadAllData);
			ResultSet resultset=prepareStatement.executeQuery(ReadAllData);
			while(resultset.next()) {
				System.out.println("ID "+prepareStatement.getResultSet().getInt(1));
				System.out.println("Manager Name "+prepareStatement.getResultSet().getString(2));
				System.out.println("Place "+prepareStatement.getResultSet().getString(3));
				System.out.println("Phone Number "+prepareStatement.getResultSet().getLong(4));
				System.out.println("IS HousingLoan Available "+prepareStatement.getResultSet().getBoolean(5));
				System.out.println("*********");
			
				
//				prepareStatement.executeUpdate();
				
			}
			System.out.println("Read All data Successfully");
			
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			finally {
				connectionProvider.closeconnection();
		}
	}
	
		
	


	@Override
	public void DeleteData(Sbi sbi) {
		System.out.println("Involked Sbi ReadSingle Data()");
		String DeleteData="delete from Sbi Where Id=?";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(DeleteData);
			prepareStatement.setInt(1, sbi.getId());
			prepareStatement.executeUpdate();
			System.out.println("Data is Deleted Successful....");
		}	

		catch(SQLException e) {
		System.out.println(e.getMessage());
	}
		finally {
		connectionProvider.closeconnection();
	}
	
	
	
	}
}
	
	
	
	


 
