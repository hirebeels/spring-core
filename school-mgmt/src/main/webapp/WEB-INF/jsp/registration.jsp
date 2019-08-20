<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<h2>Welcome To Student Registration</h2>
<style>
	.error {color:red}
</style>
</head>
<body>

<form:form action="/student/register" modelAttribute="student">
	
		<table>
			<tr>	
				<td>
					First name: 
				</td>
				<td>
					<form:input path="firstName" />
				</td>
			</tr>
			<tr>	
				<td>
					<form:label path="lastName">Last name (*):</form:label>
				</td>
				<td>
					<form:input path="lastName" /><form:errors path="lastName" cssClass="error" />
				</td>
			</tr>
			<tr>	
				<td>
					Email*
				</td>
				<td>
					<form:input path="email" /><form:errors path="email" cssClass="error" />
				</td>
			</tr>
			<tr>	
				<td>
					Password*
				</td>
				<td>
					<form:password path="password" /><form:errors path="password" cssClass="error" />
				</td>
			</tr>
			<tr>	
				<td>
					Gender*
				</td>
				<td>
					<form:radiobuttons path="gender" items="${student.genderOptions}"/><form:errors path="gender" cssClass="error" />
				</td>
			</tr>
			<tr>	
				<td>
					Select Interested Courses*
				</td>
				<td>
					<form:checkboxes path="coursesInterested" items="${student.coursesAvailable}"/><form:errors path="coursesInterested" cssClass="error" />
				</td>
			</tr>
			
			<tr>
				<td colspan="3" align="right">
					<input type="submit" value="Submit" />
				</td>
			</tr> 
		</table>
	</form:form>

</body>
</html>