<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Person Details</h1>

<c:if test="${person != null}">
Id   : ${person.personId}</br>
Name : ${person.userName} </br>
Age  : ${person.age} </br>
Technology: ${person.tech }</br>
</c:if>

<c:forEach items="${personList}" var="person">
Id   : <c:out value="${person.personId}"></c:out></br>
Name : <c:out value="${person.userName}"></c:out> </br>
Age  : <c:out value="${person.age}"></c:out> </br>
Technology:<c:out value="${person.tech}"></c:out> </br>
<br></br>
</c:forEach>

</br>
<a href="/" >Click here to add new person</a> 

</body>
</html>