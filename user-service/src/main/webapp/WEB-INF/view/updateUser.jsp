<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<body>
	<form:form action="/updateUser" method="post" modelAttribute="user">
		<table border="1">

			<form:input type="hidden" value="${user.userId}" path="userId" />

			<tr>
				<td><form:label path="emailId">EmailID: </form:label></td>
				<td><form:input type="text"  value="${user.emailId}" path="emailId" /></td>
			</tr>

			<tr>
				<td><form:label path="country">Country: </form:label></td>
				<td><form:input type="text" value="${user.country}" path="country" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update User"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>