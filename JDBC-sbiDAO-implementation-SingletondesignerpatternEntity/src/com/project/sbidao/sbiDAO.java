package com.project.sbidao;

import com.project.sbi.entity.Sbi;

public interface sbiDAO {
	void InsertQuery(Sbi sbi);
	void UpdateQuery(Sbi sbi);
	void ReadSingleData(Sbi sbi);
	void ReadAllData(Sbi sbi);
	void DeleteData(Sbi sbi);

}
