<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>

	<!-- Exception handling using try catch -->
	<!-- This is not a good practice at all -->
	
	<%-- 
	<%
	
		try {
			int k = 9 / 0;
		}
	
		catch(Exception e) {
			out.println("Error!!! - " + e.getMessage());
		}
	
	%>
	--%> 
	
	<!-- Best Practice!, first in the directive, set the error page -->
	
	
	<%
	
		int num = 9 / 0;
	
	%>
	
	
</body>
</html>