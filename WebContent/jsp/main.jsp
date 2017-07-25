<div ng-app="">
	<h1>Hello World!</h1>
		<p>Name: <input type="text" ng-model="name"></p>
		Hello <span ng-bind="name"></span>
		<hr/>
	<a href="insertOwnerForm" class="btn btn-primary">Add Owner</a>  
	<a href="viewOwnerList" class="btn btn-primary">View Owners</a>  
	<div id="crunchifyMessage"></div>
</div>