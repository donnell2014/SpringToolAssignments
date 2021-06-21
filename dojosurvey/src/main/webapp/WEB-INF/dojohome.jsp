<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="col">
			<form action ="/result" method="POST">
				<div class="form-group">
					<label>Your Name:</label>
					<input type="text" class="form-control" name="name" value="">
				</div>
				<div>
					<label for="">Dojo Location:</label>
					<select class="form-select" name= "location" aria-label="Default select example">
						<option value="San Jose">San Jose</option>
				  	</select>
				</div>
				
				<div>
					<label for="">Favorite Language:</label>
					<select class="form-select" name="language" aria-label="Default select example">
						<option value="Python">Python</option>
				  	</select>
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">Comment (optional)</label>
					<textarea class="form-control" id="exampleFormControlTextarea1" name="comment" rows="3"></textarea>
				  </div>
				<input type="submit" class="btn btn-primary" value="Submit"/>
			</form>
		</div>
	</div>
</body>
</html>