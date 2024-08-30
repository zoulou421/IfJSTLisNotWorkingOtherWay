package com.formationkilo.serveurs.test;

import java.util.ArrayList;
import java.util.List;

import com.formationkilo.serveurs.dao.IMyTest;
import com.formationkilo.serveurs.dao.MyTestImpl;
import com.formationkilo.serveurs.entities.MyTest;

public class TestApp {

	public static void main(String[] args) {
		IMyTest iMyTestDao=new MyTestImpl();
		
		MyTest myTest=new MyTest(1,"Jennifer","7786396482");
		
		List<MyTest>myListe=iMyTestDao.afficheList(myTest);
		
		for(MyTest myTest2:myListe) {
			System.out.println(myTest2.getId());
			System.out.println(myTest2.getName());
			System.out.println(myTest2.getTelephone());
		}
		
		
		
		
		
		

	}

}
