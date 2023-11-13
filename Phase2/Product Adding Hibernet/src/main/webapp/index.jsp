<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>
    <h2>Add Product</h2>
    <form action="addProduct" method="post">
        <!-- Add a hidden field for the product ID -->
        <input type="hidden" name="productId" value="">
        
        <label for="productName">Product Name:</label>
        <input type="text" name="productName" required><br>
        
        <label for="productPrice">Product Price:</label>
        <input type="number" name="productPrice" required><br>
 
        <input type="submit" value="Add Product">
    </form>
</body>
</html>