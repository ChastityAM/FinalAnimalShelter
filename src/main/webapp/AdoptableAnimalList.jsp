 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
</head>

<body class="font size: 12vw" style="color: rgb(6, 5, 68);">
    <style>
        footer {
            background-color: rgb(247, 213, 22);
            color: rgb(6, 5, 68);
            padding: 20px;
        }

        header {
            background-color: rgb(247, 213, 22);
            color: rgb(6, 5, 68);
            padding: 20px;
        }

        p,
        h2 {
            font-family: Lobster;
            color: rgb(6, 5, 68);
        }

        nav.sticky {
            position: -webkit-sticky;
            position: sticky;
            top: 0;
            padding: 5px;
        }

        button,
        .btn {
            background-color: rgb(6, 5, 68);
            color: rgb(247, 213, 22);
        }

        .right {
            float: right;
        }

        .cover {
            object-fit: cover;
        }

        aside {
            padding: 20px;
        }

        main {
            background-Image: url() background-repeat: no-repeat;
            background-size: cover;
        }

        .modal-window {
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 3px 7px rgba(0, 0, 0, 0.3);
            padding: 20px;
            transform: scale(0);
            transition: 0.2s ease-in-out all;
            position: absolute;
            margin: 1em;
        }

        .modal-window.visible {
            transform: scale(1);
            position: relative;
        }
    </style>
<div class="container">

	<h1>Animal List</h1>
	<br>
	<br>
	
	<table class="table table-striped">
		
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Type</th>
				<th scope="col">Status</th>
				<th scope="col">Date</th>
				<th scope="col">Image</th>
				<th scope="col">LocId</th>
			</tr>
		</thead>
		
		<tbody>
			
			<c:forEach var="animal" items="${allAnimals}">
				<tr>
				<td>
					<c:out value="${ animal.idAnimal }" />
				</td>
				<td>
					<c:out value="${ animal.animalType }" />
				</td>
				<td>
					<c:out value="${ animal.animalStatus }" />
				</td>
				<td>
					<c:out value="${ animal.animalDate }" />
				</td>
				<td>
					<c:out value="${ animal.animalImage }" />
				</td>
				<td>
					<c:out value="${ animal.locId }" />
				</td>
				<td>
					<a href="edit?id=<c:out value='${ animal.idAnimal }' />">
						<button class="btn btn-primary">Manage Animal</button>
					</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="delete?id=<c:out value='${ animal.idAnimal }' />">
						<button class="btn btn-danger">Adopt Animal</button>
					</a>
				</td>
				</tr>
			
			</c:forEach>
		
		</tbody>
	
	</table>

</div>
</html>