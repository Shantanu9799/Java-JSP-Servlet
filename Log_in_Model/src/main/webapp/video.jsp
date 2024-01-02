<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Videos</title>
	<style>
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
	</style>
</head>
<body>


	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		
		if(session.getAttribute("name") == null) {
			response.sendRedirect("login.jsp");
		}
	
	%>



	<form action="logout">
        	<button id="logoutBtn">Logout</button>
    </form>
	
	<hr />

	<iframe width="560" height="315" src="https://www.youtube.com/embed/ByHKuMQVpOk?si=Jxx7Ucr4fgEB-Rvg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/Dsw0pMnblWg?si=s4GjhyBVAKVbBLdi" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/rkR2Jvh-GZE?si=DwuY8ujVJxqpDDSR" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/qLjCaPbpmwI?si=KZwsUpzf96qg-HNn" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/7w3NjkcE_kE?si=Gk7pgLWSsqgf5A18" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/F63N6ImKSDc?si=92m5HoIHS2Il8Mkk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/wnbfJc9aEII?si=a84KlR5HMLgmzDAp" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/97NOjAsr8oY?si=m_B6Wc0fvC4518ze" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/LYe0MYsRk8s?si=t7K-40-JCck-iap-" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	

</body>
</html>