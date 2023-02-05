<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Read Books</title>
</head>
<body>
<table>
    <tr>
        <th>ID:</th>
        <th>Title:</th>
        <th>Rating:</th>
        <th>Description:</th>
        <th>Authors:</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.rating}</td>
            <td>${book.description}</td>
            <td>${book.authors}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>