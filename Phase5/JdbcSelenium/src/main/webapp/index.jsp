<%@page import="com.selenium.dao.ProductDAO_Impl"%>
<%@page import="com.selenium.dao.ProductDAO"%>
<%@page import="com.selenium.pojo.Product"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addproduct.jsp">
<input type="submit" name="addBtn" value="addproduct"> 
</form>
<h1><i>List of Products </i></h1>
<table border="1">
<tr><th>Product Id</th><th>Product Name</th><th>Product Cost</th><th>Edit </th><th>Delete</th></tr>
<%
ProductDAO_Impl dao=new ProductDAO_Impl();
List<Product> list=dao.selectProducts();
for(Product pro:list){
%>
<tr>
<td><%=pro.getPid()%></td>
<td><%=pro.getPname()%></td>
<td><%=pro.getCost()%></td>
<td><a href="edit.jsp?id=<%=pro.getPid() %>">Edit</a></td>
<td><a href="delete.jsp?id=<%=pro.getPid() %>">Delete</a></td>
</tr>

<%} %>
</table>
</body>
</html>
