<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <h1>Dojos</h1>
        <div class="col">
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th scope="col" >ID</th>
                        <th scope="col">Name</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${ allDojos }" var="dojo">
                    <tr> 
                        <td>${dojo.id}</td>
                        <td><a href="/dojo/${dojo.id}/info">${dojo.name}</a></td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        <hr>
        </div>
        <div class="col">
            <h1>New Dojo</h1>
            <form:form action="/dojo/create" method="post" modelAttribute="dojo">
                <p>
                    <form:label path="name">Name</form:label>
                    <form:errors path="name"/>
                    <form:input path="name"/>
                </p>
                <input type="submit" value="Submit"/>
            </form:form> 
        </div>
        <a href="/ninjas/new">New Ninja</a>
</body>
</html>