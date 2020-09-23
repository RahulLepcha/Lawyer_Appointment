<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="${contextRoot}/home">Lawyers
			Appointment</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item" id="home"><a class="nav-link" href="${contextRoot}/home">Home</a></li>
				<li class="nav-item" id="signUp"><a class="nav-link" href="${contextRoot}/signUp">Sign Up</a></li>
				<li class="nav-item" id="aboutUs"><a class="nav-link" href="${contextRoot}/aboutUs">About Us</a></li>
				<form class="form-inline">
					<input class="form-control mr-sm-2" type="text"
						placeholder="E-Mail" name="username"> <input
						class="form-control mr-sm-2" type="text" placeholder="Password"
						name="psw">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Login</button>
				<li class="nav-item" id="forgotPasword"><a class="nav-link" href="${contextRoot}/forgotPassword" title="Forgot Password">?</a></li>
				</form>
			</ul>
		</div>
	</div>
</nav>
