<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Student</title>
</head>
<body>
<form:form method="post" modelAttribute="student">
<form:label path="firstName">FirstName:</form:label>
<form:input path="firstName"/><br>
<form:label path="lastName">LastName:</form:label>
<form:input path="lastName"/><br>
<form:label path="gender">Gender:</form:label>
<form:radiobuttons items="${genders}" path="gender"/><br>
<form:label path="country">Country:</form:label>
<form:select items="${countries}" path="country"/><br>
<form:label path="notes">Notes:</form:label>
<form:textarea path="notes"/><br>
<form:label path="mailingList">Mailing List:</form:label>
<form:checkbox path="mailingList"/><br>
<form:label path="programmingSkills">Programming skills:</form:label>
<form:select path="programmingSkills" items="${skills}" multiple="true"/><br>
<form:label path="hobbies">Hobbies:</form:label>
<form:checkboxes path="hobbies" items="${hobbies}"/><br>
<form:button>Save student</form:button>
</form:form>
</body>
</html>