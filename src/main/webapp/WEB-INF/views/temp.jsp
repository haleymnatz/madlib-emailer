<%@ include file="fragments/header.jspf" %>
<%@ include file="fragments/navigation.jspf" %>

<div class="content">
	<h1 class="center-text">${madlib.title}</h1><br/><br/>
	<div>
		${newStory}
	</div>
	<br /><br/>
	
	<a href="/index" type="button" class="btn btn-outline-primary">Return Home</a>
	
	<br />
</div>
<%@ include file="fragments/footer.jspf" %>