<%@page import="java.time.LocalDateTime"%>
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
		String name = (String)request.getAttribute("name");
		Integer rollno = (Integer)request.getAttribute("rollno");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>
	
	<h1>This is help page</h1>
	<h2>My name is <%= name %> </h2>
	<h3>My rollno. is <%= rollno	 %> </h3>
	<h3>Current Date & Time is <%= time.toString() %> </h3>
	
</body>
</html>