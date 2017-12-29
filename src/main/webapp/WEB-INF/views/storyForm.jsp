<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MadLibs Emailer</title>
</head>
<body>
	<h1>Hello Friends!</h1>
	
	<br />
	
<!--	
	<form action="/index" method="POST">
		Name: <input name="name" type="text" />
		Color: <input name="color" type="text" />
		<input type="submit" />
	</form>
-->	
	
	<br/><br/>
	
<!-- NOT YET FUNCTIONAL -->	
	<form:form method="POST" action="/storyForm">
	<input name="id" type="hidden" value="${madlib.getId()}"></input>
			<c:forEach items="${madlib.getWordTypes()}" var="wordType">
					
					<label for="userInputs[${status.index}]">${wordType}</label>
					${madlib.getWordTypes()[status.index]}
					<input name="userInputs" type="text"></input>
					<br/>
				
			</c:forEach>
			<input type="submit" /><br/><br/>
	</form:form>
	<br/>
</body>
</html>