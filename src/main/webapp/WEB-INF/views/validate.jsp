<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Validator</title>
</head>
<body>
<c:forEach items="${bookErrors}" var="bookError">
    ${bookError.propertyPath}:
    ${bookError.message}
    <br>
</c:forEach>
</body>
</html>