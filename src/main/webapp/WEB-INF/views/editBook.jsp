<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
<title>Edit Book</title>
</head>
<body>
<form:form method="post" modelAttribute="book">
<form:label path="title">Title:</form:label>
<form:input path="title"/><br>
<form:label path="rating">Rating:</form:label>
<form:input path="rating"/><br>
<form:label path="description">Description:</form:label>
<form:input path="description"/><br>
<form:label path="authors">Authors:</form:label>
<form:select path="authors" multiple="true" items="${book.authors}" itemLabel="firstName"/><br>
<form:button>Edit book</form:button>
</form:form>
</body>
</html>