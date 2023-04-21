<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> All Users</h2>
<br>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="user" items="${allUsers}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="userId" value="${user.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteUser">
            <c:param name="userId" value="${user.id}"/>
        </c:url>

        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.age}</td>

            <td>

                <input type="button" value="Update"
                onclick="window.location.href ='${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href ='${deleteButton}'"/>

            </td>

        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="add"
       onclick="window.location.href='addUser'"/>

</body>
</html>
