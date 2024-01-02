<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }

        header {
            background-image: linear-gradient(#feda75, #fa7e1e, #d62976, #962fbf, #4f5bd5);
            color: #fff;	
            padding: 20px;
            text-align: center;
        }

        section {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 10px 10px 50px #000;
            justify-content: center;
            align-items: center;
        }

        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-right: 10px;
            box-shadow: 2px 2px 7px #000;
        }

        #logoutBtn {
            background-color: #dc3545;
        }

        footer {
            text-align: center;
            padding: 10px;
            background-color: #000;
            color: #fff;
        }
    </style>
</head>
<body>

	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		
		if(session.getAttribute("name") == null) {
			response.sendRedirect("login.jsp");
		}
	
	%>


    <header>
        <h1>Hello ${name}</h1>
    </header>

    <section>
        <button onclick="window.location.href='video.jsp'">Go to Video Page</button>
        <hr />
       <!--  <img src="LandingPage.jpg" alt="Landing Page" /> -->
        <hr />
        <form action="logout">
        	<button id="logoutBtn">Logout</button>
        </form>
    </section>  
     
    <footer>
        <p>&copy; 2023 Login Model. All rights reserved. | Designed by Shantanu Chatterjee</p>
    </footer>

</body>
</html>
