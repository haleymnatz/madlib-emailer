<%@ include file="fragments/header.jspf" %>
<%@ include file="fragments/navigation.jspf" %>

<div class="content">
	<h1 class="center-text">${madlib.getTitle()}</h1>

	<table class="table">
		<tbody>
			<form:form method="POST" action="/storyForm">
			<input name="id" type="hidden" value="${madlib.getId()}"></input>
					<c:forEach items="${madlib.getWordTypes()}" var="wordType">
						<tr class="table-borderless">
							<td><label for="userInputs[${status.index}]">${wordType}</label></td>
							
							<td><input name="userInputs" type="text"></input></td>
						</tr>
						<br />
					</c:forEach>
					<tr class="table-borderless">
						<td><input class="btn btn-outline-success" type="submit" value="Submit" /><br/><br/></td>
					</tr>
			</form:form>
		</tbody>
	</table>
</div>

<%@ include file="fragments/footer.jspf" %>