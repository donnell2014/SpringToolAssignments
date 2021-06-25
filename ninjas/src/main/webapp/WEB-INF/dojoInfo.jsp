<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <h1>Dojo Info</h1>
    <div class="col">
        <table class="table table-dark">
            <thead>
                <tr>
                    <th scope="col" >First Name:</th>
                    <th scope="col">Last Name:</th>
                    <th scope="col">Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${ dojo.ninjas }" var="ninja">
                    
                <tr> 
                    <td>${ninja.first_name}</td>
                    <td>${ninja.last_name}</td>
                    <td>${ninja.age}
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>