<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.product.pojo.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>

	<%-- Check if a success attribute is present in the request --%>
	<% if (request.getAttribute("success") != null) { %>
	<p style="color: green;">Product added successfully!</p>

	<%-- Display the added product details --%>
	<h3>Added Product Details:</h3>
	<p>
		ID:
		<%= request.getAttribute("productId") %></p>
	<p>
		Name:
		<%= request.getAttribute("productName") %></p>
	<p>
		Price(Rs):
		<%= request.getAttribute("productPrice") %></p>
	<% } %>

	<h3>All Products:</h3>

	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<% 
                // Retrieve all products from the request
                List<Product> allProducts = (List<Product>) request.getAttribute("allProducts");

                // Iterate over the product list and generate HTML dynamically
                for (Product product : allProducts) {
            %>
			<tr>
				<td><%= product.getId() %></td>
				<td><%= product.getName() %></td>
				<td><%= product.getPrice() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
	<p><a href="index.jsp">Add Another Product</a></p>
</body>
</html>