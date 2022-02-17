<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
</head>
<body>
	<h2><a href="addCourseView">Register Course</a></h2>&nbsp;
	<table border="1">
		<thead>
			<tr>
				<th>CourseID</th>
				<th>CourseName</th>
				<th>CourseCountry</th>
				<th>EmailId</th>
				<th>Price</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${courses}" var="course">
				<tr>
					<td>${course.courseId}</td>
					<td>${course.courseName}</td>
					<td>${course.courseCountry}</td>
					<td>${course.emailId}</td>
					<td>${course.price}</td>
					<td><a href="/updateCoursePage?courseId=${course.courseId}">Edit</td>
					<td><a href="/deleteCourse?courseId=${course.courseId}">Delete</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>