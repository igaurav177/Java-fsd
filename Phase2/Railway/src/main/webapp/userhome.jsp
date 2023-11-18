<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home</title>
</head>
<body>
<h1>USER HOME</h3>
<button onclick="window.location.href='userhome.jsp'">User Home</button>
<button onclick="window.location.href='search.jsp'" >Search Crossing</button>
<button onclick="window.location.href='favorite.jsp'">Favorite Crossing</button>
<sql:setDataSource var="snapshot" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/railway" user="root" password="root"
/>
<sql:query dataSource="${snapshot}" var="result">
SELECT * FROM adminhome;
</sql:query>
<c:forEach var="row" items="${result.rows}">
<div>
<h4>Name: <c:out value="${row.Name}" /></h4>
<p>Address: <c:out value="${row.Address}" /></p>
<p>Landmark: <c:out value="${row.Landmark}" /></p>
<p>Time Schedule: <c:out value="${row.Trainschedule}" /></p>
<p>Person In-Charge: <c:out value="${row.pname}" /></p>
<p>Status: <c:out value="${row.status}" /></p>
<form action="AddToFavorite" method="POST">
<input type="hidden" name="itemId" value="${row.id}" />
<input type="submit" value="Add to Favorite" />
</form>
</div>
<hr />
</c:forEach>
<button onclick="window.location.href='login.jsp'">logout</button>
   <%
       String addedToFav = request.getParameter("addedToFav");
       if (addedToFav != null && addedToFav.equals("true")) {
           out.println("<script>alert('Added to Favorite'); window.location='favorite.jsp';</script>");
       }
   %>
</body>
</html>
