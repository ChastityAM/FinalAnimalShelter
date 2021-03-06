<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%@taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Location</title>
<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
				<h1 class="display-4">Location List</h1>
					<p class="Lead"> The information for all shelters is below.
					</p>
			</div>
		</div>
		<c:forEach var="location" items= "${allLocations}">
			<p><c:out value= "${location.name}"/></p>
			<p><c:out value= "${location.phone}"/></p>
			<p><c:out value= "${location.address}"/></p>
		</c:forEach>
	</div>
		<br></br>
</body>
</html>