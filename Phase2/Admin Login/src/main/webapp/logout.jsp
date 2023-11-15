<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.HttpSession" %>

<%
   
    HttpSession s = request.getSession(false);
    if (s != null) {
        s.invalidate();
    }

    
    response.sendRedirect("index.jsp");
%>