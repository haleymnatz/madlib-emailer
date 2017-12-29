<%@ include file="fragments/header.jspf" %>
<%@ include file="fragments/navigation.jspf" %>

<div class="container">
	<h1>Hello Friends!</h1>

	<br/><br/>
	<table class="table">
		<tbody>
			<form:form method="POST" action="/storyForm">
			<input name="id" type="hidden" value="${madlib.getId()}"></input>
					<c:forEach items="${madlib.getWordTypes()}" var="wordType">
						<tr>
							<td><label for="userInputs[${status.index}]">${wordType}</label></td>
							
							<td><input name="userInputs" type="text"></input></td>
							<br/>
						</tr>
					</c:forEach>
					<tr>
					<td><input class="btn btn-outline-primary" type="submit" value="Submit" /><br/><br/></td>
					</tr>
			</form:form>
		</tbody>
	</table>
	<br/>
</div>

<%@ include file="fragments/footer.jspf" %>