<div class="container">
	<h1>Sign Up</h1>
	<p>Please fill in this form to create an account.</p>
	<hr>
	 <form id="signup" onsubmit = "return validateForm()" method="post" modelAttribute="Profile" class="px-4 py-3">
	
		<div class="form-group">
			<input type="text" class="form-control col-sm" id="Name" name="Name"
				placeholder="Enter Name" required>
		</div>
		<div class="form-group">
			<input type="email" class="form-control"
				id="exampleDropdownFormEmail1" placeholder="email@example.com" name="email"
				required>
		</div>
		<div class="form-group">
			<input type="password" class="form-control" name="password"
				id="Password" placeholder="Password" required>
		</div>
		<div class="form-group"> 
			<input type="password" class="form-control" name=""
				id="cPassword" placeholder="Confirm Password" required>
		</div>
		<div class="form-group">
			<input type="text" class="form-control" id="mobileNum" pattern="[1-9]{1}[0-9]{9}" name="mobile"
				placeholder=" 10 digit Mobile Number" required>
				
				
		</div>
		<div class="custom-control custom-switch">
							<input type="checkbox" class="custom-control-input"
								id="customSwitch1" name="Erem" checked="1"> <label
								class="custom-control-label" for="customSwitch1">Email Reminder
								</label>
									</div>	
											<div class="custom-control custom-switch">
										<input type="checkbox" name="Srem" class="custom-control-input"
								id="customSwitch2" checked="1"> <label
								class="custom-control-label" for="customSwitch2">SMS Notification
								</label>
								</div>
							<div class="custom-control custom-switch">
						
							<input type="checkbox" class="custom-control-input"
								id="customSwitch3" checked="1"> <label
								class="custom-control-label" name="Prem" for="customSwitch3">Push Notification
								</label>
								</div>
							<div class="custom-control custom-switch">
							<input type="checkbox" name="Rrem" class="custom-control-input"
								id="customSwitch4" checked="1"> <label
								class="custom-control-label" for="customSwitch4">Reminder</label>
						</div>
		<button type="submit" class="btn btn-primary" id="submit" onclick="return Validate()">Confirm</button>
	</form>
</div>

<script>
$("#signup").ajaxForm({
    url: '/signUp',
    type: 'post',
    processData: false,
    success: function (data) {
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
    	  var regx = /^[6-9]\d{9}$/ ;
    	  if(regx.test(text))
    	    alert("valid");
    	  else
    	    alert("invalid");
    	   
    }
    function validateEmail(sEmail) {
    	  var reEmail = /^(?:[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+\.)*[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+@(?:(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9\-](?!\.)){0,61}[a-zA-Z0-9]?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9\-](?!$)){0,61}[a-zA-Z0-9]?)|(?:\[(?:(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\.){3}(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\]))$/;

    	  if(!sEmail.match(reEmail)) {
    	    alert("Invalid email address");
    	    return false;
    	  }

    	  return true;

    	}
</script>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#submit").click(function () {
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