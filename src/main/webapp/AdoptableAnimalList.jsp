<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%@taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdoptableAnimals</title>
<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">
<div class="container">

	<h1>Animal Form</h1>
	
	<div class="card-body">

		<%-- will select the form we use, update or insert --%>
		<c:if test="${ animal != null }">
			<form action="update" method="get">
			<h1>Update Animal</h1>
		</c:if>

		<c:if test="${ animal == null }">
			<form action="insert" method="get">
			<h1>Add Animal</h1>
		</c:if>
				
				
		<%-- hidden input we can use to pass in a value we want --%>
		<c:if test="${animal != null}">
			<input type="hidden" name="id" value="<c:out value='${animal.id}' />" />
		</c:if>
				
		<!-- item field -->
		<fieldset class="form-group">
					
			<label>Type</label>
			<input type="text" value="<c:out value='${ animal.type }'/>" 
				class="form-control" name="item" required>
					
		</fieldset>
				
		<fieldset class="form-group">
					
			<label>Status</label>
			<input type="text" value="<c:out value='${ animal.status }'/>" 
				class="form-control" name="status" required>
					
		</fieldset>
				
		<fieldset class="form-group">
					
			<label>Date</label>
			<input type="date" value="<c:out value='${ animal.date }'/>" 
				class="form-control" name="date" required>
					
		</fieldset>
				
		<fieldset class="form-group">
					
			<label>Image</label>
			<input type="url" value="<c:out value='${ animal.image }'/>" 
				class="form-control" name="image" required>
					
		</fieldset>
		
		<fieldset class="form-group">
					
			<label>LocId</label>
			<input type="number" value="<c:out value='${ animal.locID }'/>" 
				class="form-control" name="locId" required>
					
		</fieldset>		

		<button type="submit" class="btn btn-success">Save</button>

		</form>

		</div>
	
</div>
		<br></br>
</body>
</html>