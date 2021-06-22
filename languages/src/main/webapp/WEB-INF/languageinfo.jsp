<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class='row'>
            <div class="col">
                <table class="table table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Creator</th>
                            <th scope="col">Version</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${allLang}" var="lang">
                        <tr> 
                            <td scope="row">${lang.name}</td>
                            <td scope="row">${lang.creator}</td>
                            <td scope="row">${lang.version}</td>
                            <td><a href="/lang/edit/${lang.id}">edit</a> || <a href="/lang/${lang.id}">view</a>||<a href="/lang/delete/${lang.id}">delete</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            <hr>
            </div>
        </div>
    </div>
    <form:form action="/lang/create" method="post" modelAttribute="langs">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input type="number" path="version"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>  
</body>
</html>