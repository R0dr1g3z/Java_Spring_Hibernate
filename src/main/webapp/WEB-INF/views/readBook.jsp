<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Read Books</title>
</head>
<body>
<table>
    
    <c:forEach items="${books}" var="book">
        <tr>
            <th>ID:</th>
            <td>${book.id}</td>
        </tr>
        <tr>
            <th>Title:</th>
            <td>${book.title}</td>
        </tr>
        <tr>
            <th>Rating:</th>
            <td>${book.rating}</td>
        </tr>
        <tr>
            <th>Description:</th>
            <td>${book.description}</td>
        </tr>
        <tr>
            <th>Authors:</th>
            <td>${book.authors}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>