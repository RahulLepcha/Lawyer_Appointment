<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<br>
<br>
<br>
<br>
<div class="container case-wrapper-scroll-y case-custom-scrollbar">
	<legend>${prop} Case Detail</legend>
	<sf:form action="${contextRoot}/Case_I" modelAttribute="Case1" method="POST">
		<fieldset>
			<!-- Client Name Text box-->
			<div class="row">
				<div class="col">
					<label for="exampleSelect1">Client Name</label>
				</div>
				<div class="col">
					<label for="exampleSelect1">Court Name</label>
				</div>
				<div class="col">
					<label>Priority Case</label>
					<sf:checkbox path="CasePriority" value="on" />
				</div>
			</div>
			<!-- need to check for the sf auto fill -->
			<div class="row">
				<div class="col-sm form-inline">
					<!-- code for client name -->
					<sf:select class="form-control" id="Cid" path="Cid"	style="width: 150px" items="${ClientName}" itemLabel="Cname" itemValue="Cid" />
					<div class="col-sm">
						<a class="btn btn-outline-success my-2 my-sm-2"
							href="${contextRoot}/client_I" role="button">Add Client</a>
					</div>

				</div>


				<!-- need to check for the sf auto fill -->
				<div class="col-sm form-inline">
					<!-- code for court name-->
					<sf:select class="form-control" id="Crtid" path="Crtid"
						style="width: 150px" items="${CourtName}" itemLabel="CrtName"
						itemValue="Crtid" />
					<div class="col-sm">
						<a class="btn btn-outline-success my-2 my-sm-2"
							href="${contextRoot}/Court_Add" role="button">Add</a>
					</div>

				</div>
				<div class="col-sm">
					<sf:input type="text" class="form-control" placeholder="Reminder Time"
						path="AppointmentTime" id="AppointmentTime" style="width: 150px" />
				</div>
			</div>
			<div class="row">
				<!--Adding Case Id  -->
				<div class="col">
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Case Id</label>
						<sf:input type="text" class="form-control"
							placeholder="Client Case Id" path="caseuID" id="caseuID"
							style="width: 150px" />
					</div>
				</div>

				<!-- Opposition Name-->
				<div class="col">
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Opposition
							Name </label>
						<sf:input type="text" class="form-control"
							placeholder="Opposition Name" path="OppositionPartyName"
							id="OppositionPartyName" style="width: 150px" />
					</div>
				</div>

				<!-- Adding Stage -->
				<div class="col">
					<!-- Stage Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Stage </label>
						<sf:input type="text" class="form-control"
							placeholder="Case Stage" path="Stage" id="Stage"
							style="width: 150px" />
						<sf:hidden path="status" value="on" />
					</div>

				</div>

			</div>
			<!-- Adding all the Dates -->
			<div class="row">
				<div class="col">
					<!-- Case initial Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Initial
							Date</label>
						<!-- Date Picker needed for time being im using text box -->
						<sf:input type="text"
							class="form-control datepicker date fa fa-clock-o"
							placeholder="Case initial Date" path="CaseIdate" id="CaseIdate"
							style="width: 150px" />
					</div>
				</div>
				<div class="col">
					<!-- Case Previous Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Previous
							Date</label>
						<sf:input type="text"
							class="form-control  datepicker date fa fa-clock-o"
							placeholder="Case Previous Date" path="CasePdate" id="CasePdate"
							style="width: 150px" />
					</div>

				</div>
				<div class="col">
					<!-- Case Next Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Next Date</label>
						<!-- Date Picker needed for time being im using text box -->
						<sf:input type="text"
							class="form-control  datepicker date fa fa-clock-o"
							placeholder="Case Next Date" path="CaseNdate" id="CaseNdate"
							style="width: 150px" />
					</div>
				</div>
			</div>





			<!-- MuLTILINEText box for Case Brief-->
			<div class="form-group">
				<label for="Textarea">Enter Case Brief</label>
				<sf:textarea class="form-control" path="CaseBrief" id="CaseBrief"
					rows="3" />
			</div>
			<sf:hidden path="Lid" />
			<sf:hidden path="status" />
			<sf:hidden path="CaseId" />
			
			<!--SUbMIT Button-->
			<button type="submit" class="btn btn-primary">Submit</button>
			<!--end-->
		</fieldset>
	</sf:form>
</div>