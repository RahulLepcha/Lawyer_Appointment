<div class="container case-wrapper-scroll-y case-custom-scrollbar">
	<legend>${prop} Case Detail</legend>
	<form>
		<fieldset>

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
						<div class="custom-control custom-switch">
							<input type="checkbox" class="custom-control-input"
								id="customSwitch1" checked=""> <label
								class="custom-control-label" for="customSwitch1">Priority
								Case</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm form-inline">
				<select class="form-control" id="C_name" style="width: 150px">
						<c:forEach items="${clientNames}" var="cname">
								<option>${cname}</option>
								</c:forEach>
							</select>
						<div class="col-sm">
							<a class="btn btn-outline-success my-2 my-sm-2"
								href="${contextRoot}/client_I" role="button">Add Client</a>
						</div>

					</div>
					<div class="col-sm form-inline">

						<select class="form-control" id="Crt_name" style="width: 150px">
							<c:forEach items="${crtNames}" var="crtname">
								<option>${crtname}</option>
								</c:forEach>
						</select>
						<div class="col-sm">
							<a class="btn btn-outline-success my-2 my-sm-2"
								href="${contextRoot}/Court_Add" role="button">Add</a>
						</div>

					</div>
					<div class="col-sm"></div>
				</div>
			</div>



			<!-- Adding Opposition Name And Stage  -->
			<div class="row">
				<div class="col">
					<!-- Case Id Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Case Id</label>
						<!-- Date Picker needed for time being im using text box -->
						<input type="text" class="form-control" placeholder="Case ID"
							id="NDate" style="width: 150px">
					</div>
				</div>
				<div class="col">
					<!-- Opposition Name Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Opposition
							Name </label> <input type="text" class="form-control"
							placeholder="Opposition Name" id="OppName" style="width: 150px">
					</div>
				</div>
				<div class="col">
					<!-- Stage Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Stage </label>
						<!-- Date Picker needed for time being im using text box -->
						<input type="text" class="form-control" placeholder="Stage"
							id="Stage" style="width: 150px">
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
						<input type="text" class="form-control datepicker date fa fa-clock-o"
							placeholder="Case initial Date" id="InitDate"
							style="width: 150px">
					</div>
				</div>
				<div class="col">
					<!-- Case Previous Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Previous
							Date</label>
						<!-- Date Picker needed for time being im using text box -->
						<input type="text" class="form-control  datepicker date fa fa-clock-o"
							placeholder="Case Previous Date" id="PDate" style="width: 150px">
					</div>

				</div>
				<div class="col">
					<!-- Case Next Date Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Next Date</label>
						<!-- Date Picker needed for time being im using text box -->
						<input type="text" class="form-control  datepicker date fa fa-clock-o"
							placeholder="Case Next Date" id="NDate" style="width: 150px">
					</div>
				</div>
			</div>





			<!-- MuLTILINEText box for Case Brief-->
			<div class="form-group">
				<label for="Textarea">Enter Case Brief</label>
				<textarea class="form-control" id="Brief" rows="3"></textarea>
			</div>

			<!--SUbMIT Button-->
			<button type="submit" class="btn btn-primary">Submit</button>
			<!--end-->
		</fieldset>
	</form>
</div>