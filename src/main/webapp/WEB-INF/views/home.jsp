<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>5 Articles on page</h1>
<table>
    <tr>
        <th>Title:</th>
        <th>Content:</th>
        <th>Created:</th>
    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.created}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>