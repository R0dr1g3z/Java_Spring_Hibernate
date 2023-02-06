<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Book</title>
</head>
<body>
<form:form method="post" modelAttribute="book">
<form:label path="title">Title:</form:label>
<form:input path="title"/><br>
<form:errors path="title"/>
<form:label path="rating">Rating:</form:label>
<form:input path="rating"/><br>
<form:errors path="rating"/>
<form:label path="description">Description:</form:label>
<form:input path="description"/><br>
<form:errors path="description"/>
<form:label path="authors">Authors:</form:label>
<form:select path="authors" items="${authors}" itemLabel="firstName" multiple="true"/><br>
<form:label path="publisher">Publisher:</form:label>
<form:select path="publisher" items="${publishers}" itemLabel="name"/><br>
<form:button>Create book</form:button>
</form:form>
<a href="/formReadBook">List of books</a>
</body>
</html>