package com.project.sbidao;

import java.util.List;

import com.project.sbi.entity.Sbi;

public interface sbiDAO {
	void sbiInsertQuery(int ID,String ManagerName,String Place,long PhoneNumber,boolean AreTheyProvideHousingloan);
	void sbiUpdateQuery(String ManagerName, int ID);

	List<Sbi> ReadAllQuery();
	void sbiReadSingleData(int ID);
	void sbiDeleteQuery(int ID);
	
	
	
	
}
