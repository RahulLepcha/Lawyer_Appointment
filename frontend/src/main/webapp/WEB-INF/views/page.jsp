<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<spring:url var="css" value="/resources/css" />
<spring:url var="vendor" value="/resources/vendor" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Lawyer Appointment - ${title}</title>
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}';
</script>
<!-- Bootstrap core CSS -->
<link href="${vendor}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<link href="${vendor}/bootstrap/css/bootstrap-datepicker.css"
	rel="stylesheet">

<link href="${css}/custom.css" rel="stylesheet">
<link href="${css}/datatables.css" rel="stylesheet">
<!-- Custom styles for this template -->

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="${css}/buttons.dataTables.css" rel="stylesheet">
<link href="${css}/buttons.jqueryui.css" rel="stylesheet">
<link href="${css}/buttons.bootstrap4.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/default_nav.jsp"%>



	<!-- Page Content -->
	<!-- when Home is clicked -->
	<c:if test="${UserClickHome==true}">
		<%@include file="index.jsp"%>
	</c:if>
	<!-- when Sign up is clicked -->
	<c:if test="${UserClicksignUp==true}">
		<%@include file="signUp.jsp"%>
	</c:if>
	<!-- when About us is clicked -->
	<c:if test="${UserClickaboutUs==true}">
		<%@include file="aboutUs.jsp"%>
	</c:if>
	<!-- when forgot Password is clicked -->
	<c:if test="${UserClickforgotPassword==true}">
		<%@include file="forgotPassword.jsp"%>
	</c:if>
	<!-- when client in is clicked -->
	<c:if test="${UserClickclient_Index==true}">
		<%@include file="./Client/client_Index2.jsp"%>
	</c:if>

	<!-- when client in is clicked -->
	<c:if test="${UserClickclient_I==true}">
		<%@include file="./Client/client_2.jsp"%>
	</c:if>
	
	<!-- when user clicks any certain profile edit button -->
	<c:if test="${UserClickedEditClientProfile == true }">
		<%@include file="./Client/client_2.jsp"%>
	</c:if>
	

	<!-- when client in is clicked -->
	<c:if test="${UserClickindex==true}">
		<%@include file="./index.jsp"%>
	</c:if>

	<!-- when Case in is clicked -->
	<c:if test="${UserClickCase_Index==true}">
		<%@include file="./Case/Case_Index.jsp"%>
	</c:if>

	<!-- when Case_I in is clicked -->
	<c:if test="${UserClickCase_I==true}">
		<%@include file="./Case/Case_I.jsp"%>
	</c:if>

	<!-- when Court_Add in is clicked -->
	<c:if test="${UserClickCourt_Add==true}">
		<%@include file="./Court_Add.jsp"%>
	</c:if>

	<%@include file="./NewFile1.jsp"%>

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${vendor}/jquery/jquery.min.js"></script>
	<script src="${vendor}/bootstrap/js/bootstrap.bundle.min.js"></script>

	<script src="${vendor}/bootstrap/js/bootstrap-datepicker.min.js"></script>
	<script src="${js}/jquery.dataTables.js"></script>
	<script src="${js}/buttons.jqueryui.js"></script>
	<script src="${js}/datatables.js"></script>
	<script src="${js}/buttons.bootstrap4.js"></script>
	<script src="${js}/dataTables.buttons.js"></script>

	<script src="${js}/myapp.js"></script>

</body>

</html>
