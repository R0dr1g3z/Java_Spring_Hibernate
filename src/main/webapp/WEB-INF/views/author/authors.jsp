<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Authors</title>
</head>
<body>
<table>
    <tr>
        <th>FirstName:</th>
        <th>LastName:</th>
        <th>Actions:</th>
    </tr>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td><a href="/formEditAuthor/${author.id}">EDIT</a>
            <a href="/formDeleteAuthor/${author.id}">DELETE</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>