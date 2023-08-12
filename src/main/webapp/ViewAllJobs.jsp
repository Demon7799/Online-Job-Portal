<%@page import="com.jobportal.commons.DatabaseConnection"%>
<%@page import="java.util.List"%>
<%@page import="com.jobportal.dao.PostJobDAO"%>
<%@page import="com.jobportal.models.JobPostModel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin All Jobs</title>
<%@include file="StaticComponents/LoadCSS.jsp"%>
</head>
<body>
	<!-- To import the navbar -->
	<%@include file="StaticComponents/Navbar.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h5 class="text-center text-primary">All Jobs</h5>
				<%
		PostJobDAO jobDAO = new PostJobDAO(DatabaseConnection.getConnection());
		List<JobPostModel> jobList = jobDAO.getAllJobs();
		
		for(JobPostModel jobs:jobList)
		{	
	%>
				<div class="card mt-2">
					<div class="card-body">
						<div class="text-center text-primary">
							<i class="far fa-clipboard fa-2x"></i>
						</div>
						<h5><%=jobs.getJobTitle() %></h5>
						<h6><%=jobs.getCompanyName() %></h6>
						<p><%=jobs.getJobDescription() %></p>
						<!-- <br> -->
						<div class="form-row">
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm" value="Location : <%=jobs.getJobLocation() %>" readonly>
							</div>
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm" value="Category : <%=jobs.getJobCategory() %>" readonly>
							</div>
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm" value="Status : <%=jobs.getJobStatus() %>" readonly>
							</div>
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm" value="Last Date : <%=jobs.getJobLastDate() %>" readonly>
							</div>
						</div>
						<h6>Posted On : <%=jobs.getCreatedOn() %></h6>
						<div class="text-center">
							<a href="#" class="btn btn-sm bg-success text-white mr-4">Edit</a>
							<a href="#" class="btn btn-sm bg-danger text-white ml-4">Delete</a>
						</div>
					</div>
				</div>
				<%} %>
			</div>
		</div>
	</div>


	<!-- To import the footer -->
	<%@include file="StaticComponents/Footer.jsp"%>
</body>
</html>