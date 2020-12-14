<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<br>
<br>
<br>
<br>
<br>
<div class="container">
<div class="row">
<c:if test="${not empty message}">
<div class="col-xs-12">
<div class="alert alert-success alert-dismissible">
<button type="button" class="close" data-dismiss="alert">&times;</button>
</div></div>
</c:if>
</div>	

</div>	
	
<div class="container case-wrapper-scroll-y case-custom-scrollbar">
	<legend>${prop} Enter Client Record</legend>
	 <sf:form class="form-horizontal"  modelAttribute="c2" action="${contextRoot}/client_2" method="POST">
		<fieldset>
			<div class="row">
				<div class="acol">
					<!-- Client Name Text box-->
					<div class="form-group">
						<label class="col-form-label">Client Name</label>
							 <sf:input type="text" id="Cname" path="Cname" style="width:250px"/>
					</div>
				</div>
				<div class="row">
					<!-- Client Mobile Text box-->
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Mobile</label>
						 <sf:input type="text" class="form-control"
							placeholder="Client Mobile Number" path="CMoblie" id="CMoblie" style="width: 250px"/>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="row">
					<!-- Text box for email-->
					<div class="form-group">
						<label for="InputEmail1">Email address</label> <sf:input type="Email"
							class="form-control" path="CEmail" id="CEmail" aria-describedby="emailHelp"
							placeholder="Enter email" style="width: 250px"/> <small
							id="CEmail" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
				</div>
				<sf:hidden  path="Lid" />
				<sf:hidden  path="Cid" />
				<sf:hidden  path="status" />
						
				<div class="row">
					<!-- MuLTILINEText box for Area-->
					<div class="form-group">
						<label for="Textarea">Enter Your address</label>
						<sf:textarea class="form-control" path="Caddress" id="Caddress" rows="3"
							style="width: 250px"/>
			<sf:button type="submit" class="btn btn-primary">Submit</sf:button>
		
					</div>
				</div>
			</div>
			<!--SUbMIT Button-->
			
			<!--end-->
		</fieldset>
	</sf:form>
</div>