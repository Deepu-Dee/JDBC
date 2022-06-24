package com.project.sbidao;

import com.project.sbi.entity.Sbi;

public class sbiTester {
	public static void main(String[] args) {
		sbiDaoImpl impl=new sbiDaoImpl();
//		Sbi sbi=new Sbi(14,"Yashvanth","Banglore",6365698251L, true);
//		
//		impl.InsertQuery(sbi);
		
//		Sbi sbi=new Sbi();
//		sbi.setPhoneNumber(8886759920L);
//		sbi.setId(7);
//		impl.UpdateQuery(sbi);
		
//		Sbi sbi=new Sbi();
//		sbi.setId(4);
//		impl.ReadSingleData(sbi);
//		
//		Sbi sbi=new Sbi();
//		impl.ReadAllData(sbi);
		
		
		Sbi sbi=new Sbi();
		sbi.setId(12);
		impl.DeleteData(sbi);
		
		
		
	}
}


