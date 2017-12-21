<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MadLibs Emailer</title>
</head>
<body>
	<h1>Hello Friends!</h1>
	
	<br />
	
	<form action="/index" method="POST">
		Name: <input name="name" type="text" />
		Color: <input name="color" type="text" />
		<input type="submit" />
	</form>
</body>
</html>