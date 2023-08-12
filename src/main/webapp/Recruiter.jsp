<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard</title>

<%@include file="StaticComponents/LoadCSS.jsp"%>
<style>
.back-img {
	background-image: linear-gradient(to right, rgb(242, 112, 156),
		rgb(255, 148, 114));
		height:90vh;
		width:100%;
}
</style>
</head>
<body>
	<!-- To import the navbar -->
	<%@include file="StaticComponents/Navbar.jsp"%>

	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-white p-4">Welcome Admin</h1>
		</div>
	</div>
	<!-- To import the footer -->
	<%@include file="StaticComponents/Footer.jsp"%>
</body>
</html>