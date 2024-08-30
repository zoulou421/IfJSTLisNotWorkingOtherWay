package com.formationkilo.serveurs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.formationkilo.serveurs.dao.IMyTest;
import com.formationkilo.serveurs.dao.MyTestImpl;
import com.formationkilo.serveurs.entities.MyTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/Test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public TestServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> myList=new ArrayList<String>();
		myList.add("item1");
		myList.add("item2");
		myList.add("item3");
		myList.add("item3");
		
		request.setAttribute("liste",myList);
		
		
         IMyTest iMyTestDao=new MyTestImpl();
        
		
		 MyTest myTest=new MyTest();
		
		 
		 myTest.setId(2);
		 myTest.setName("Natasha");
		 myTest.setTelephone("88999");
		
		
		 List<MyTest>myListe=iMyTestDao.afficheList(myTest);
		 
		  myListe.add(myTest);
		  
		  
		  
		  request.setAttribute("myListe",myListe);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test-page.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
