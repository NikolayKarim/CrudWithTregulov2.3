<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Jason Statham
  Date: 20.04.2023
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <title>Form of add user</title>

</head>
<body>
<h2>Please Writing Form</h2>
<form:form action="saveUser" modelAttribute="user">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    Age <form:input path="age"/>
    <br>
    <br>

    <input type="submit" value="Press">

</form:form>

</body>
</html>
