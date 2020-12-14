<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">
	<h1>Sign Up</h1>
	<p>Please fill in this form to create an account.</p>
	<hr>
	<sf:form id="signup" onsubmit="return validateForm()" method="POST"
		modelAttribute="Profile" class="px-4 py-3">
		<sf:hidden path="status" />
		<sf:select path="role" id="role">
			<option value="lawyer">Lawyer</option>
			<option value="Admin">Admin</option>
			<option value="Client">Client</option>

		</sf:select>

		<div class="form-group">
			<sf:input type="text" class="form-control col-sm" id="Name"
				path="Uname" placeholder="Enter Name" />
		</div>
		<div class="form-group">
			<sf:input type="email" class="form-control"
				id="exampleDropdownFormEmail1" placeholder="email@example.com"
				path="Uemail" />
		</div>
		<div class="form-group">
			<sf:input type="password" class="form-control" path="Upassword"
				id="Password" placeholder="Password" />
		</div>
		<div class="form-group">
			<input type="password" class="form-control" path="cPassword"
				id="cPassword" placeholder="Confirm Password" />
		</div>
		<div class="form-group">
			<sf:input type="text" class="form-control" id="mobileNum"
				pattern="[1-9]{1}[0-9]{9}" path="Umobile"
				placeholder=" 10 digit Mobile Number" />
		</div>

		<div class="custom-control custom-switch">
			Reminder:
			<sf:checkbox path="Rrem" value="on" />
			<p><p>
				SMS Notification:
				<sf:checkbox path="Srem" value="on" /> 
			<p>  
			 Email notfication:	<sf:checkbox path="Erem" value="on" />   
			<p>
			 Push Notification:<sf:checkbox path="Prem" value="on" />   
			<p>
						
		</div>
						
				
		<button type="submit" class="btn btn-primary" id="submit"
			onclick="return Validate()">Confirm</button>
	</sf:form>
</div>

<script>
	$("#signup").ajaxForm({
		url : '/signUp',
		type : 'post',
		processData : false,
		success : function(data) {
			console.log("Added Signup! data = " + JSON.stringify(data))
		}
	})
</script>
<script type="text/javascript">
	function validateForm() {
		checkPhone();
	}
	function checkPhone() {

		var text = document.getElementById("pno").value;
		var regx = /^[6-9]\d{9}$/;
		if (regx.test(text))
			alert("valid");
		else
			alert("invalid");

	}
	function validateEmail(sEmail) {
		var reEmail = /^(?:[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+\.)*[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+@(?:(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9\-](?!\.)){0,61}[a-zA-Z0-9]?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9\-](?!$)){0,61}[a-zA-Z0-9]?)|(?:\[(?:(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\.){3}(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\]))$/;

		if (!sEmail.match(reEmail)) {
			alert("Invalid email address");
			return false;
		}

		return true;

	}
</script>

				<script type="text/javascript"
					src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
				<script type="text/javascript">
					$(function() {
						$("#submit").click(function() {
							var password = $("#Password").val();
							var confirmPassword = $("#cPassword").val();
							if (password != confirmPassword) {
								alert("Passwords do not match.");
								return false;
							}
							return true;
						});
					});
				</script>