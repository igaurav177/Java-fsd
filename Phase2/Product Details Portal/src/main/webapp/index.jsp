<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>Add Product</h2>
    <form action="ProductServlet" method="post">
        Product Name: <input type="text" name="productName" required><br>
        Price: <input type="text" name="price" required><br>
        <input type="submit" value="Add Product">
    </form>

</body>
</html>