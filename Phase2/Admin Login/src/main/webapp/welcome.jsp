<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.HttpSession" %>    
 <%
    
    HttpSession s = request.getSession(false);
    if (s == null || s.getAttribute("user") == null) {
        response.sendRedirect("login.jsp");
    }
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    
    String userEmail = (String) session.getAttribute("user");
%>
<h1>Welcome, <%= userEmail %>!</h1>

<p>This is your welcome page. You can add more content here.</p>

<a href="logout.jsp">Logout</a>
</body>
</html>