package com.formationkilo.serveurs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import com.formationkilo.serveurs.entities.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/Person")
public class PersonServlet extends HttpServlet  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Create a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Doe", 30));
        persons.add(new Person("Jane Smith", 25));

        // Add the list to the request scope
        request.setAttribute("persons", persons);

        // Forward to the JSP page
        request.getRequestDispatcher("/displayPersons.jsp").forward(request, response);
    }
}