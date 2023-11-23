<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%List<User> list=(List<User>)request.getAttribute("list"); %>
<table border="1">
<tr><th>User Id</th><th>User Name</th><th>User Email</th><th>Action</th></tr>
<%for(User u:list){ %>
<tr><td><%=u.getId() %></td><td><%=u.getUname() %></td><td><%=u.getUemail() %></td><td><a href="update.jsp">Update</a></td></tr>
<%} %>
</table>
</body>
</html>

