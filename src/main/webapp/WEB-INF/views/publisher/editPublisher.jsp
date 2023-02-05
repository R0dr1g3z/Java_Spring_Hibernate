<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <html>

        <head>
            <title>Edit publisher</title>
        </head>

        <body>
            <form:form method="post" modelAttribute="publisher">
                <form:label path="name">Name:</form:label>
                <form:input path="name" /><br>
                <form:button>Edit publisher</form:button>
            </form:form>
        </body>

        </html>