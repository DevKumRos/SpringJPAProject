<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registeration Page</title>
</head>
<body>
<h1>Registeration Page</h1></b></b>
<form action="addPerson" method="post">
<b>Person Id	:</b><input type="text" name="personId"/></br>
<b>UserName 	:</b><input type="text" name="userName"/></br>
<b>Age 			:</b><input type="text" name="age"/></br>
<b>Technology 			:</b><input type="text" name="tech"/></br>
<input type="submit" value="Register"/>
</form>
</br>
</br>
</br>
<h2>Get Person Information By Id</h2>
<form action="getPersonById">
<input type="text" name="personId"/><br></br>
<input type="submit" value="Get Person Detail"/>
</form>

</br>
</br>
</br>
<h2>Get Person Information By Tech</h2>
<form action="getPersonByTech">
<input type="text" name="tech"/><br></br>
<input type="submit" value="List of Person Detail"/>
</form>
</body>
</html>