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

	<h1>Product Form</h1>
	
	<div class="card-body">

		<%-- will select the form we use, update or insert --%>
		<c:if test="${ product != null }">
			<form action="update" method="get">
			<h1>Update Product</h1>
		</c:if>

		<c:if test="${ product == null }">
			<form action="insert" method="get">
			<h1>Create Product</h1>
		</c:if>
				
				
		<%-- hidden input we can use to pass in a value we want --%>
		<c:if test="${product != null}">
			<input type="hidden" name="id" value="<c:out value='${product.id}' />" />
		</c:if>
				
		<!-- item field -->
		<fieldset class="form-group">
					
			<label>Item</label>
			<input type="text" value="<c:out value='${ product.item }'/>" 
				class="form-control" name="item" required>
					
		</fieldset>
				
		<fieldset class="form-group">
					
			<label>Quantity</label>
			<input type="number" value="<c:out value='${ product.qty }'/>" 
				class="form-control" name="qty" required>
					
		</fieldset>
				
		<fieldset class="form-group">
					
			<label>Description</label>
			<input type="text" value="<c:out value='${ product.description }'/>" 
				class="form-control" name="description" required>
					
		</fieldset>
				

		<button type="submit" class="btn btn-success">Save</button>

		</form>


		</div>
	
	

</div>
		<br></br>
</body>
</html>