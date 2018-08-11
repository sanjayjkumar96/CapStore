<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Merchant</title>
</head>
<body>
<form:form method="POST" action="/merchantSignUp" modelAttribute="merchant">
    <form:label path="m_name">Name</form:label>
    <form:input path="m_name" />
     
   
	<form:label path="m_email">Email</form:label>
    <form:input path="m_email" />
	<form:label  path="m_password">Password</form:label>
    <form:input  path="m_password"/>
     
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>