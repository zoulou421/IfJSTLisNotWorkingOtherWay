<%@page import="com.formationkilo.serveurs.entities.MyTest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>Bienvenue à la page JSP</h1>
     
      <h2>List of Items</h2>
    <ul>
        <!-- Iterate over the list using JSTL -->
        <c:forEach var="MyObject item" items="${myListe}">
            <li>${item}</li>
        </c:forEach>
        
        <!-- If the list is empty or null -->
        <c:if test="${empty items}">
            <li>No items found.</li>
        </c:if>
    </ul>
     
     
     
       <ul>
        <%
            // Retrieve the list from the request object
            List<MyTest> items = (List<MyTest>) request.getAttribute("myListe");

            // Check if the list is not null and iterate over it
            if (items != null) {
                for (int i = 0; i < items.size(); i++) {
                	MyTest item = items.get(i);
        %>
                    <li><%= item %></li>
        <%
                }
            } else {
        %>
            <li>No items found.</li>
        <%
            }
        %>
    </ul>
    
    
    
     <ul>
        <%
            // Retrieve the list from the request object
            
            List<MyTest> items_ = (List<MyTest>) request.getAttribute("myListe");

            // Check if the list is not null and iterate over it
            if (items_ != null) {
            	
                for (MyTest item:items_) {
                   
        %>
                    <li><%= item %></li>
        <%
                }
            } else {
        %>
            <li>No items found.</li>
        <%
            }
        %>
    </ul>
    
    
</body>
</html>