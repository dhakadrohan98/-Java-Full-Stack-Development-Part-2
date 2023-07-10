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
		String email = (String)request.getAttribute("email");
		String name = (String) request.getAttribute("name");
		String password = (String)request.getAttribute("password");
	%>
	
	<h1>Form Response page</h1>
	
	<h2>user email is <%= email %></h2>
	<h2>user name is <%= name %></h2>
	<h2>user password is <%= password %></h2>
	
	
</body>
</html>