<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- DIrective Tag (use to import packages) -->
<%@page import = "java.util.Scanner" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>

	<!-- There are four types of tags in JSP : 
		
		-- Scriptlet Tag
		-- Declaration Tag 
		-- Directive Tag 
		-- Expression Tag
		
	 -->
	 
	 <h2>Tags in JSP</h2>
	 
	 <!-- Scriptlet Tag -->
	 <%
	 	int num = 10;
	 	out.println(num);
	 %>
	 
	 <!-- Declaration Tag -->
	 <%! 
	 	int power = 10;
	 %>
	 <!-- It will be available everywhere -->
	 <h3>My Power is <%= power %></h3>
	 
	 <!-- Expression Tag -->
	 <%= 3+2 %>
	 <%= power %>
	 
	 <!-- Directive Tag (on top of the file) -->
	 <%
	 	Scanner sc = new Scanner(System.in);
	 %>
	 
</body>
</html>