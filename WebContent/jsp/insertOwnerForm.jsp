<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Add New Actor</h1>
<form:form method="POST" action="save" class="form-horizontal">
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
			<input type="submit" value="Save" />
			<input type="button" onclick="location.href='/PropertyDB/viewOwner'" value="Cancel" />
		</div>
	</div>
</form:form>