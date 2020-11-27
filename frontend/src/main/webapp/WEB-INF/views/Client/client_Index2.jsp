<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<div class="container">
	<div class="row">
		<div class="col-lg-9">
			<form class="form-inline ">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				<div class="col-lg-3">
					<a class="btn btn-outline-success my-2 my-sm-2"
						href="${contextRoot}/client_I" role="button">New</a>
				</div>

			</form>

		</div>

	</div>
	<div class="row">
		<div class="table-wrapper-scroll-y my-custom-scrollbar">

			<table id="clientNames" class="table table-bordered table-striped mb-0">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Contact</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
					</tr>
				</thead>
				<tfoot>
				<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Contact</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
					</tr>
				</tfoot>
			</table>

		</div>
	</div>
	<div class="row">
		<div class="col-lg-3">
			<a class="btn btn-outline-success my-2 my-sm-2"
				href="${contextRoot}/client_II" role="button">update</a>
		</div>
		<div class="col-lg-3">
			<a class="btn btn-outline-success my-2 my-sm-2"
				href="${contextRoot}/client_I" role="button">Delete</a>
		</div>
	</div>

</div>