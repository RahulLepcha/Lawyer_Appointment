<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div class="container">
<div class="row">

<c:if test="${not empty message}">
<div class="col-xs-12">
<div class="alert alert-success alert-dismissible">
<button type="button" class="close" data-dismiss="alert">&times;</button>

${message}

</div></div>
</c:if>
</div>	

</div>	

<div class="container">
	<div class="row">
		<div class="col-lg-9">
				<div class="col-lg-3">
					<a class="btn btn-outline-success my-2 my-sm-2"
						href="${contextRoot}/client_index2" role="button">New</a>
				</div>
	
		</div>

		<div class="table-wrapper-scroll-y my-custom-scrollbar">

			<table id="clientNames"
				class="table table-bordered table-striped mb-0">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Contact</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Contact</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
						<th scope="col"></th>
					</tr>
				</tfoot>
			</table>

		</div>
	</div>
	
</div>