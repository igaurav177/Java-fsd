<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Product Details</h2>
    <p>Product Name: <%= request.getAttribute("productName") %></p>
    <p>Price: <%= request.getAttribute("price") %></p>
    <a href="index.jsp">Add Another Product</a>
</body>
</html>