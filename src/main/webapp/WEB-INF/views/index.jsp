<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HappyLibs Emailer</title>
</head>
<body>
	<h1>Welcome to HappyLibs!</h1>
	
	<br/><br/>
	
	<h3>Choose your story below!</h3>
	
	<c:forEach items="${madlibs}" var="madlib">
		${madlib.title}
		<h4><a href="/storyForm?id=${madlib.id}">Click here to do this HappyLib!</a></h4>
	</c:forEach>
	
</body>
</html>