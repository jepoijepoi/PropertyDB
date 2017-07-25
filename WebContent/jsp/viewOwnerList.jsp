<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Owners List</h1>
<div>
<table id="ownerTable" class="table table-striped table-hover table-condensed table-bordered">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="owner" items="${ownerList}">
			<tr>
				<td>${owner.ownerId}</td>
				<td>${owner.ownerFName}</td>
				<td>${owner.ownerLName}</td>
				<td><a href="editOwner/${owner.ownerId}">Edit</a></td>
				<td><a href="deleteOwner/${owner.ownerId}" onclick="javascript:confirmForChanges();">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br />
<a href="insertOwnerForm">Add New Owner</a>
</div>
<script>
	function confirmForChanges (){
		var r= confirm("Do you want to proceed");
		if (r == true) {
     		document.getElementById('submitButton').action = "/root/submitAction.do";
     		document.getElementById('submitButton').submit();
    		alert("Your changes have been saved");
		}if (r ==false){
       		alert("changes not saved")
       	}
	}
</script>