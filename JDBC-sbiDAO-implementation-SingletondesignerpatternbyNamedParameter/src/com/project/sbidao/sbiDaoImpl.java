package com.project.sbidao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.project.sbi.connectionprovider.connectionProvider;
import com.project.sbi.entity.Sbi;

public class sbiDaoImpl implements sbiDAO {

	@Override
	public void sbiInsertQuery(int ID, String ManagerName, String Place, long PhoneNumber,
			boolean AreTheyProvideHousingloan) {
		System.out.println("Involked Sbi Insert data()");
		String InsertQuery="Insert into Sbi Values(?,?,?,?,?)";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(InsertQuery);
			prepareStatement.setInt(1, ID);
			prepareStatement.setString(2, ManagerName);
			prepareStatement.setString(3, Place);
			prepareStatement.setLong(4, PhoneNumber);
			prepareStatement.setBoolean(5, AreTheyProvideHousingloan);
			prepareStatement.executeUpdate();
			System.out.println("Data Inserted Succesfully.....");
		
	}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
		}
	}

	@Override
	public void sbiUpdateQuery(String ManagerName, int ID) {
		System.out.println("Involked Sbi Update data()");
		String UpdateQuery="Update Sbi set ManagerName=? where ID=?";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(UpdateQuery);
			prepareStatement.setString(1, ManagerName);
			prepareStatement.setInt(2, ID);
			prepareStatement.executeUpdate();
			System.out.println("Data Updated Succesfully.....");
		
	}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
		}
		
		
	}


	@Override
	public List<Sbi> ReadAllQuery() {
		System.out.println("Involked Sbi ReadAllData()");
		String ReadAllQuery="Select * from Sbi";
		List<Sbi> container=new ArrayList<Sbi>();
		Sbi sbi=null;
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement prepareStatement=connection.prepareStatement(ReadAllQuery);
			ResultSet resultset=prepareStatement.executeQuery(ReadAllQuery);
			while(resultset.next()) {
				int Id=resultset.getInt(1);
				String ManagerName=resultset.getString(2);
				String Place=resultset.getString(3);
				String PhoneNumber=resultset.getString(4);
				boolean AreTheyProvideHousingLoan=resultset.getBoolean(5);
				
				sbi=new Sbi(Id, ManagerName, Place, null, AreTheyProvideHousingLoan);
				container.add(sbi);
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return container;
	}

	@Override
	public void sbiReadSingleData(int ID) {
		System.out.println("Involked Sbi ReadSingleData");
		String ReadSingleData="select * from Sbi Where ID=?";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement preparestatement=connection.prepareStatement(ReadSingleData);
			preparestatement.setInt(1, ID);
			preparestatement.executeQuery();
//			Resultset resultset=preparestatement.executeQuery();
			
			System.out.println("Read Single Data Succesfully...");
			
	
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
		}
		
	}

	@Override
	public void sbiDeleteQuery(int ID) {
		System.out.println("Involked Sbi DeleteQuery");
		String DeleteQuery="Delete from Sbi where ID=?";
		try {
			Connection connection=connectionProvider.getconnection();
			PreparedStatement preparestatement=connection.prepareStatement(DeleteQuery);
			preparestatement.setInt(1, ID);
			preparestatement.executeUpdate();
			System.out.println("Delete Data Succesfully");
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connectionProvider.closeconnection();
		
		
	}
	}
}

	
	
	
	
	


 
