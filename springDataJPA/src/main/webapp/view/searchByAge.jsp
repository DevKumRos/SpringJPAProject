<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Search person by Age</h1>
<form action="getPersonByAgeGrt">
<input type="text" name="age"/><br></br>
<input type="submit" value="Get Person Who age greater than mention"/>
</form>

<br></br>
<br></br>

<h1>Search person by Age in sorted manner</h1>
<form action="getPersonByAgeSorted">
<input type="text" name="age"/><br></br>
<input type="submit" value="Get Person Who age greater than mention"/>
</form>
</body>
</html>