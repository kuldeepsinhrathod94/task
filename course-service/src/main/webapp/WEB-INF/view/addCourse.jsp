<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Course</title>
</head>
<body>
	<form:form action="/addCourse" method="post" modelAttribute="course">
		<table border="1">
			<tr>
				<td><form:label path="courseName">Course Name: </form:label></td>
				<td><form:input type="text" path="courseName" /></td>
			</tr>
			
			<tr>
				<td><form:label path="courseCountry">Country : </form:label></td>
				<td><form:input type="text" path="courseCountry" /></td>
			</tr>

			<tr>
				<td><form:label path="internationalPrice">International Price: </form:label></td>
				<td><form:input type="text" path="internationalPrice" /></td>
			</tr>
			
			<tr>
				<td><form:label path="domesticPrice">Domestic Price: </form:label></td>
				<td><form:input type="text" path="domesticPrice" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
