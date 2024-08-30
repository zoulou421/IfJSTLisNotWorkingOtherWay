package com.formationkilo.serveurs.dao;

import java.util.ArrayList;
import java.util.List;

import com.formationkilo.serveurs.entities.MyTest;

public class MyTestImpl implements IMyTest{

	@Override
	public List<MyTest> afficheList(MyTest myTest) {
		List<MyTest>myListTests=new ArrayList<MyTest>();
		myListTests.add(myTest);
		
		return myListTests;
	}


}
