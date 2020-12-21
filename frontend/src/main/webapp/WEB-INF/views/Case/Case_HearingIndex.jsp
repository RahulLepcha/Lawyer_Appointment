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
<script>
	window.val = '${id}';
</script>

<div class="container">
	<div class="row">
			<div class="table-wrapper-scroll-y my-custom-scrollbar">

			<table id="courtHearing"
				class="table table-bordered table-striped mb-0">
				<thead>
					<tr>
						<th scope="col">Case Id</th>
						<th scope="col">Opposition</th>
						<th scope="col">Stage</th>
						<th scope="col">Appointment Time</th>
						<th scope="col">Case Brief</th>
						<th scope="col">Previous Hearing Date</th>
						<th scope="col">Previous Hearing Date</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th scope="col">Case Id</th>
						<th scope="col">Opposition</th>
						<th scope="col">Stage</th>
						<th scope="col">Appointment Time</th>
						<th scope="col">Case Brief</th>
						<th scope="col">Previous Hearing Date</th>
						<th scope="col">Previous Hearing Date</th>
					</tr>
				</tfoot>
			</table>

		</div>
	</div>
	
</div>