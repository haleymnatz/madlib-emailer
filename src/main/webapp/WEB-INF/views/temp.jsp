<%@ include file="fragments/header.jspf" %>
<%@ include file="fragments/navigation.jspf" %>

<div class="content">
	${newStory}
	<br />
	
	${madlib.getStory()}
	
	
	<br />
	<a href="/index" type="button">Home</a>
	
	<br />
</div>
<%@ include file="fragments/footer.jspf" %>