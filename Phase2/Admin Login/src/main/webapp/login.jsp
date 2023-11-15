
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="com.admin.pojo.*" %>
<%@ page import="com.admin.dbutil.*" %>
<%@ page import="org.hibernate.query.Query" %>


<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
   
    if (email != null && password != null) {
    	 Session s = DbUtil.dbConn();
    	Query q=s.createQuery("FROM Student WHERE email = :email AND password = :password");
    	q.setParameter("email", email);
    	q.setParameter("password", password);
    	List<Student> students = q.list();
    	
    	s.close();
    	
    	if (!students.isEmpty()) {
            
           
            session.setAttribute("user", email);
            response.sendRedirect("welcome.jsp");
        } else {
           
        	response.sendRedirect("index.jsp");
        	
        	out.println("<p>Incorrect email or password. Please try again.</p>");
         
        }
    	
               
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>



<form action="login.jsp">
    <label>Email: <input type="text" name="email"></label><br>
    <label>Password: <input type="password" name="password"></label><br>
    <input type="submit" value="Login">
</form>

</body>
</html>
