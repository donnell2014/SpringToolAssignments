<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>New Ninja</h1>
    <div class="col">
        <form:form action="/ninjas/create" method="post" modelAttribute="ninja">
            <p>
                <form:label path="dojo">Select Team:</form:label>
                <form:select path="dojo" id="">
                <c:forEach items="${ allDojos }" var="d">
                    <option value="${d.id}">${d.name}</option>
                </c:forEach>
                </form:select>
            </p>
            <p>
                <form:label path="first_name">First Name:</form:label>
                <form:errors path="first_name"/>
                <form:input path="first_name"/>
            </p>
            <p>
                <form:label path="last_name">Last Name:</form:label>
                <form:errors path="last_name"/>
                <form:input path="last_name"/>
            </p>
            <p>
                <form:label path="age">Age</form:label>
                <form:errors path="age"/>
                <form:input type="number" path="age"/>
            </p>
            <input type="submit" value="Submit"/>
        </form:form> 
    </div>
</body>
</html>