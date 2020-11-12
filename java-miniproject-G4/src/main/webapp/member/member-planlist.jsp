<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Plan List</h1>
<table border="1">
		<tr>
			<th>Plan Name</th>
			<th>Fess</th>
			<th>Duration</th>
			<th>Sports Name</th>
		</tr>
		<c:forEach var="plans" items="${plans}">
			<tr>
			
			<td><c:out value="${plans.planName}"></c:out></td>  
			<td><c:out value="${plans.fees}"></c:out></td>
			<td><c:out value="${plans.duration} months"></c:out></td>
			<td><c:out value="${plans.sportName}"></c:out></td>
			
			<td>
			<a href="<%=request.getContextPath()%>/MemberController/buyMembership?planId=${plans.planId}">Buy now</a>
			</td>
			
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>