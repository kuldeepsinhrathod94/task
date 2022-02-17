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
	<form:form action="/updateCourse" method="post" modelAttribute="course">
		<table border="1">

			<form:input type="hidden" value="${course.courseId}" path="courseId" />

			<tr>
				<td><form:label path="courseName">Course Name: </form:label></td>
				<td><form:input type="text"  value="${course.courseName}" path="courseName" /></td>
			</tr>
			
			<tr>
				<td><form:label path="courseCountry">Country: </form:label></td>
				<td><form:input type="text"  value="${course.courseCountry}" path="courseCountry" /></td>
			</tr>

			<tr>
				<td><form:label path="internationalPrice">International Price: </form:label></td>
				<td><form:input type="text" value="${course.internationalPrice}" path="internationalPrice" /></td>
			</tr>
			
			<tr>
				<td><form:label path="domesticPrice">Domestic Price: </form:label></td>
				<td><form:input type="text" value="${course.domesticPrice}" path="domesticPrice" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update Course"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>