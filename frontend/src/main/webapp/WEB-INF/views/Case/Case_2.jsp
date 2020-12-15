<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div class="container case-wrapper-scroll-y case-custom-scrollbar">
	<legend>${prop} Case Detail</legend>
	<sf:form modelAtrribute="case" action="${contextRoot}/Case_2" method="POST">
		<fieldset>
<br>
<br>
<br>
			<!-- Client Name Text box-->
			<div class="form">
				<div class="row">
					<div class="col">
						<label for="exampleSelect1">Client Name</label>
					</div>
					<div class="col">
						<label for="exampleSelect1">Court Name</label>
					</div>
					<div class="col">
					</div>
				</div>
				<!-- need to check for the sf auto fill -->
				<div class="row">
					<div class="col-sm form-inline">
				<select class="form-control" id="C_name" name="C_name" style="width: 150px">
						<c:forEach items="${clientNames}" var="cname">
								<option>${cname}</option>
								</c:forEach>
							</select>
						<div class="col-sm">
							<a class="btn btn-outline-success my-2 my-sm-2"
								href="${contextRoot}/client_I" role="button">Add Client</a>
						</div>

					</div>
				
				
				<!-- need to check for the sf auto fill -->
					<div class="col-sm form-inline">

						<select class="form-control" id="Crt_name" name="Crt_name" style="width: 150px">
							<c:forEach items="${crtNames}" var="crtname">
								<option>${crtname}</option>
								</c:forEach>
						<select>
						<div class="col-sm">
							<a class="btn btn-outline-success my-2 my-sm-2"
								href="${contextRoot}/Court_Add" role="button">Add</a>
						</div>

					</div>
					<div class="col-sm"></div>
				</div>
			</div>



			<div class="row">
			<!--Adding Case Id  -->
				<div class="col">
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Case Id</label>
						 <sf:input type="text" class="form-control"
							placeholder="Client Case Id" path="caseuID" id="caseuID" style="width: 150px"/>
						</div>
				</div>
				
				<!-- Opposition Name-->
				<div class="col">
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Opposition
							Name </label>
						<sf:input type="text" class="form-control"
							placeholder="Opposition Name" path="OppositionPartyName" id="OppositionPartyName" style="width: 150px"/>
						</div>
				</div>
				
				<!-- Adding Stage -->
				<div class="col">
					<!-- Stage Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Stage </label>
						<sf:input type="text" class="form-control"
							placeholder="Case Stage" path="Stage" id="Stage" style="width: 150px"/>
							<sf:hidden path="status" value="on"/>
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
						<sf:input type="text" class="form-control datepicker date fa fa-clock-o" placeholder="Case initial Date" path="CaseIdate" id="CaseIdate" style="width: 150px"/>
					</div>
				</div>
				<div class="col">
					<!-- Case Previous Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Previous
							Date</label>
						<sf:input type="text" class="form-control  datepicker date fa fa-clock-o" placeholder="Case Previous Date" path="PreviousDate" id="PreviousDate" style="width: 150px"/>
					</div>

				</div>
				<div class="col">
					<!-- Case Next Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Next Date</label>
						<!-- Date Picker needed for time being im using text box -->
						<sf:input type="text" class="form-control  datepicker date fa fa-clock-o" placeholder="Case Next Date" path="NextDate" id="NextDate" style="width: 150px"/>
					</div>
				</div>
			</div>





			<!-- MuLTILINEText box for Case Brief-->
			<div class="form-group">
				<label for="Textarea">Enter Case Brief</label>
				<sf:textarea class="form-control" path="CaseBrief"  id="CaseBrief" rows="3"/>
			</div>

			<!--SUbMIT Button-->
			<button type="submit" class="btn btn-primary">Submit</button>
			<!--end-->
		</fieldset>
	</sf:form>
</div>