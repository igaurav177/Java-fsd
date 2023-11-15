<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.admin.pojo.Student"%>
<%@page import="com.admin.studentdao.StudentDAO"%>
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
StudentDAO dao=new StudentDAO();
Student student=new Student();
student.setName(request.getParameter("name"));
student.setEmail(request.getParameter("email"));
student.setPassword(request.getParameter("password"));
SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
Date dateOfBirth=dateFormat.parse(request.getParameter("dob"));
student.setDateOfBirth(dateOfBirth);
int row=dao.addStudent(student);
if(row>0){
	response.sendRedirect("success.jsp");
	
}
else{
	out.print("Invalid details");
}
%>
</body>
</html>
