<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<script language="javascript">
	var req;

	function searchText() {
		var search = document.getElementById("search").value;
		if (window.xmlHttpRequest) {
			req = new xmlHttpRequest();
		} else if (window.ActiveXObject) {
			req = new ActiveXObject("Microsoft.XMLHttp");
		}
		var url = "/client_Index?search=" + search;
		req.open("get", url, true);
		req.onreadystatechange = callback;
		req.send(null);
	}

	function callback() {
		if (req.readyState == 4) {
			var result = document.getElementById('result');
			result.innerHTML = '';
			var respText = req.responseText;
			alert(respText);
			if ((respText.length) != 0) {
				document.getElementById('result').style.display = 'block';
				var str = req.responseText.split("\n");
				var items;
				for (i = 0; i < str.length - 1; i++) {
					items = '<div onclick="setText(this.innerHTML);" ';
					items += '>' + str[i] + '</div>';
					result.innerHTML += items;
				}
			} else {
				document.getElementById('result').style.display = 'none';
			}
		}
	}

	function focusIn() {
		document.getElementById("search").focus();
	}

	function setText(value) {
		document.getElementById('search').value = value;
		document.getElementById('result').style.display = 'none';
		document.getElementById('result').innerHTML = '';
	}
</script>

<body onload="focusIn();">
	<h2>Ajax Search Example</h2>
	<form>
		<b>Enter Search Keyword</b>
		<table border="0">
			<tr>
				<td><input type="text" id="search" onkeyup="searchText()" /></td>
			</tr>
			<tr>
				<td><div id="result"></div></td>
			</tr>
		</table>
		<input type="submit" id="search" name="find" value="find" />
	</form>
</body>
<div class="container">
	<div class="row">
		<div class="col-lg-9">
			<form class="form-inline ">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				<div class="col-lg-3">
					<a class="btn btn-outline-success my-2 my-sm-2"
						href="${contextRoot}/client_I" role="button">New</a>
				</div>

			</form>

		</div>

	</div>
	<div class="row">
		<div class="table-wrapper-scroll-y my-custom-scrollbar">

			<table class="table table-bordered table-striped mb-0">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Contact</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
					</tr>
					<tsr> <%@page import="java.sql.DriverManager"%>
					<%@page import="java.sql.ResultSet"%> <%@page
						import="java.sql.Statement"%> <%@page
						import="java.sql.Connection"%> <%
 	String driver = "com.mysql.jdbc.Driver";
 String connectionUrl = "jdbc:mysql://localhost:8082/";
 String database = "lawyerapp";
 String userid = "sa";
 String password = "";
 try {
 	Class.forName(driver);
 } catch (ClassNotFoundException e) {
 	e.printStackTrace();
 }
 Connection connection = null;
 Statement statement = null;
 ResultSet resultSet = null;
 try {
 	String roll_no = request.getParameter("roll_no");
 	connection = DriverManager.getConnection(connectionUrl + database, userid, password);
 	statement = connection.createStatement();
 	String sql = "SELECT * FROM CLIENT_PROFILE where C";
 	resultSet = statement.executeQuery(sql);
 	int i = 0;
 	while (resultSet.next()) {
 		String city_name = resultSet.getString("c_name");
 		i++;
 		out.println(city_name);
 	}
 	connection.close();
 } catch (Exception e) {
 	e.printStackTrace();
 }
 %>

					</tr>
				</thead>
				<tbody></tbody>
			</table>

		</div>
	</div>
	<div class="row">
		<div class="col-lg-3">
			<a class="btn btn-outline-success my-2 my-sm-2"
				href="${contextRoot}/client_II" role="button">update</a>
		</div>
		<div class="col-lg-3">
			<a class="btn btn-outline-success my-2 my-sm-2"
				href="${contextRoot}/client_I" role="button">Delete</a>
		</div>
	</div>

</div>