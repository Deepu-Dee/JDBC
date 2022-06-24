package com.project.sbidao;

import java.util.List;

import com.project.sbi.entity.Sbi;

public class sbiTester {
	public static void main(String[] args) {
		sbiDaoImpl impl=new sbiDaoImpl();
//		impl.sbiInsertQuery(15, "JAYA", "Madhugiri", 1238529637l, true);
		
//		impl.sbiUpdateQuery("Renukesh",4);
		
//		List<Sbi> allrecord=impl.ReadAllQuery();
//		for(Sbi sbi:allrecord) {
//		System.out.println(sbi);
//		
		impl.sbiReadSingleData(1);
		
		}

//	
	
		
//		impl.sbiDeleteQuery(15);
	
		
	}



