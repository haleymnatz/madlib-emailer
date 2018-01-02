<%@ include file="fragments/header.jspf" %>
<%@ include file="fragments/navigation.jspf" %>

<div class="content">
	<h1 class="d-flex justify-content-center">Welcome to HappyLibs!</h1>
	
	<br/><br/>
	
	<h3 class="center-text">Choose your story below!</h3>
	
	<c:forEach items="${madlibs}" var="madlib">
		<div class="card text-center">
			<div class="card-body">
				<h4>${madlib.title}</h4>
				<a href="/storyForm?id=${madlib.id}" class="btn btn-outline-success">Click here to do this HappyLib!</a>
			</div>
		</div>
		<br/>
	</c:forEach>
</div>

<%@ include file="fragments/footer.jspf" %>