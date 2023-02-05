<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>

    <head>
        <title>Publishers</title>
    </head>

    <body>
        <table>
            <tr>
                <th>Name:</th>
                <th>Actions:</th>
            </tr>
            <c:forEach items="${publishers}" var="publisher">
                <tr>
                    <td>${publisher.name}</td>
                    <td><a href="/formEditPublisher/${publisher.id}">EDIT</a>
                        <a href="/formDeletePublisher/${publisher.id}">DELETE</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>

    </html>