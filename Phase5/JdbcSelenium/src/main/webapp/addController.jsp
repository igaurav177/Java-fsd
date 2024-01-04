<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.selenium.pojo.Product"%>
<%@page import="com.selenium.dao.ProductDAO_Impl"%>
<%@page import="com.selenium.dao.ProductDAO"%>
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
<%
ProductDAO_Impl dao=new ProductDAO_Impl();
Product product=new Product();
product.setPid(Integer.parseInt(request.getParameter("pid")));
product.setPname(request.getParameter("pname"));
product.setCost(Integer.parseInt(request.getParameter("pcost")));
int row=dao.addProduct(product);
if(row>0){
	response.sendRedirect("success.jsp");
	
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>
