<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="${contextRoot}/home">Lawyers Appointment</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item" id="home"><a class="nav-link" href="${contextRoot}/home">Home
				</a></li>
				
				
				<li class="nav-item" id="client_Index"><a class="nav-link" href="${contextRoot}/client_Index">Client
				</a></li>
				
				<!-- Drop down for Case -->

				<li class="nav-item" id="Case_Index"><a class="nav-link" href="${contextRoot}/Case_Index">Case
				</a></li>

				<!-- Drop down for View Appointment -->

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Appointment </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Todays</a> <a
							class="dropdown-item" href="#">Show Calendar</a>
					</div></li>
					
				<li class="nav-item" id="aboutUs"><a class="nav-link" href="${contextRoot}/aboutUs">About Us</a></li>
				<form class="form-inline">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
				
				<!-- Drop down for Profile -->

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> DudeName </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Update Me</a> <a
							class="dropdown-item" href="#">Logout</a>
					</div></li>
			</ul>
		</div>
	</div>
</nav>
