<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Edit Actor</h1>
<form:form method="POST" action="/PropertyDB/editSave" class="form-horizontal">
	<form:hidden path="ownerId" />
	<div class="control-group">
		<label class="control-label" for="inputOwnerFName">First Name</label>
		<div class="controls">
			<form:input path="ownerFName" type="text" id="inputOwnerFName" placeholder="First Name" />
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="inputOwnerLName">Last Name</label>
		<div class="controls">
			<form:input path="ownerLName" type="text" id="inputOwnerLName" placeholder="Last Name" />
		</div>
	</div>
	<div class="control-group">
		<div class="controls">
			<br/>
			<input type="submit" value="Edit Save" />
			<input type="button" onclick="location.href='/PropertyDB/viewOwnerList'" value="Cancel" />
		</div>
	</div>
</form:form>