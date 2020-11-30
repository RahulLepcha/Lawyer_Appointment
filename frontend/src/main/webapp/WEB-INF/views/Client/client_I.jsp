
<br>
<br>
<br>
<br>
<br>

<div class="container case-wrapper-scroll-y case-custom-scrollbar">
	<legend>${prop} Enter Client Record</legend>
	 <form method="post" modelAttribute="client_I" >
		<fieldset>
			<div class="row">
				<div class="col">
					<!-- Client Name Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Client
							Name</label> <input type="text" class="form-control"
							placeholder="Client Name" name="name" style="width: 250px">
					</div>
				</div>
				<div class="col">
					<!-- Client Mobile Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Mobile</label> <input
							type="text" class="form-control"
							placeholder="Client Mobile Number" name="mobile"
							style="width: 250px">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<!-- Text box for email-->
					<div class="form-group">
						<label for="InputEmail1">Email address</label> <input type="email"
							class="form-control" name="email" aria-describedby="emailHelp"
							placeholder="Enter email" style="width: 250px"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
				</div>
				<div class="col">
					<!-- MuLTILINEText box for Area-->
					<div class="form-group">
						<label for="Textarea">Enter Your address</label>
						<textarea class="form-control" name="addr" rows="3"
							style="width: 250px"></textarea>
					</div>
				</div>
			</div>
			<!--SUbMIT Button-->
			<button type="submit" class="btn btn-primary">Submit</button>
			
			<!--end-->
		</fieldset>
	</form>
</div>