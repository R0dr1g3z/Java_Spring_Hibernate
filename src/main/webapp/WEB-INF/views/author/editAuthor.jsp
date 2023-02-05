<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Edit Author</title>
</head>
<body>
<form:form method="post" modelAttribute="author">
<form:label path="firstName">FirstName:</form:label>
<form:input path="firstName"/><br>
<form:label path="lastName">LastName:</form:label>
<form:input path="lastName"/><br>
<form:button>Edit author</form:button>
</form:form>
</body>
</html>