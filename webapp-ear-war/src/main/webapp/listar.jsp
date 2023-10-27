<%--
  Created by IntelliJ IDEA.
  User: luissantos
  Date: 27/10/23
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de usuarios</title>
</head>
<body>
    <h1>Lista de Usuario</h1>
    <ul>
        <c:forEach items="${usuarios}" var="u">
            <li>${u.username}</li>
        </c:forEach>
    </ul>
</body>
</html>
