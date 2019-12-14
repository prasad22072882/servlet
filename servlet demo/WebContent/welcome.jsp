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
		//HTTP 1.1
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		//HTTP 1.0
		response.setHeader("pragma", "no-cache");
		//Proxies
		response.setHeader("Expires", "0");
		
		if (session.getAttribute("user") == null) {
			response.sendRedirect("login.html");
		}
	%>
	<h1>Welcome ${user}</h1>
	<br><br>
	<a href="video.jsp">video</a>
	<br>
	<form action="logout">
		<input type="submit" value="logout">
	</form>
</body>
</html>