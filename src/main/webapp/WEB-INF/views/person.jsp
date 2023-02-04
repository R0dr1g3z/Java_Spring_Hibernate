<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Person</title>
</head>
<body>
<form:form method="post" modelAttribute="person">
<form:label path="login">Login:</form:label>
<form:input type="text" path="login"/><br>
<form:label path="password">Password:</form:label>
<form:input type="password" path="password"/><br>
<form:label path="email">Email:</form:label>
<form:input type="text" path="email"/><br>
<form:button>Save</form:button>
</form:form>
</body>
</html>