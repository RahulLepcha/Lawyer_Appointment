<div class="container">
	<div class="row">
		<h1>About Us</h1>
		<hr />
	</div>
	<div><p>Something here 1</p>
		<c:forEach items="${pro}" var="pname">
		<p>Something here 2</p>
			<p>${pname.Uname}</p>
			<p>Something here 3</p>
		</c:forEach>

	</div>

</div> 