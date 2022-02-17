<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
	<h2><a href="/addUserView">Register User</a></h2>&nbsp;
	<table border="1">
		<thead>
			<tr>
				<th>UserID</th>
				<th>EmailID</th>
				<th>Country</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.userId}</td>
					<td>${user.emailId}</td>
					<td>${user.country}</td>
					<td><a href="/updateUserPage?userId=${user.userId}">Edit</td>
					<td><a href="/deleteUser?userId=${user.userId}">Delete</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>