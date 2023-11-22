<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h2>Student Information</h2>

    <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
        
        <tbody>
          
            <tr>
                <td><%= request.getAttribute("Id") %></td>
                <td><%= request.getAttribute("name") %></td>
                <td><%= request.getAttribute("email") %></td>
            </tr>
            
        </tbody>
    </table>
</body>
</html>