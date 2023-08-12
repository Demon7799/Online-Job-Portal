<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Job</title>
<%@include file="StaticComponents/LoadCSS.jsp"%>

</head>
<body>


	<c:if test="${empty userObject}">
		<c:redirect url="Login.jsp" />
	</c:if> 
	<!-- To import the navbar -->
	<%@include file="StaticComponents/Navbar.jsp"%>
	
	<div class="container p-4">
		<div class="col-md-10 offset-md-1">
			<div class="card">
				<div class="card-body">
					<div class="text-center text-success">
						<i class="fas fa-user-friends fa-3x"></i>
						<c:if test="${not empty successMsg}">
                            <div class="alert alert-success" role="alert">${successMsg}</div>
                            <c:remove var="successMsg" /> 
                        </c:if>
						<h5>Add New Job</h5>
					</div>
					<form action="addjob" method="post">
						<div class="form-group">
							<label>Job Title</label> <input type="text" name="jobTitle"
								required class="form-control">
						</div>
						<div class="form-group">
							<label>Company</label> <input type="text" name="jobCompany"
								required class="form-control">
						</div>
						<div class="form-row">
							<div class="form-group col-md-4">
								<label>Location</label> <select name="location"
									class="custom-select" id="inlineFormCustomSelectPref">
									<option selected>--Select Location--</option>
									<option value="Remote">Remote</option>
									<option value="Japan">Japan</option>
									<option value="SouthKorea">South Korea</option>
									<option value="India">India</option>
									<option value="Australia">Australia</option>
									<option value="Denmark">Denmark</option>
									<option value="Singapore">Singapore</option>
									<option value="NewYork">New York</option>
									<option value="Germany">Germany</option>
									<option value="Poland">Poland</option>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label>Category</label> <select name="category"
									class="custom-select" id="inlineFormCustomSelectPref">
									<option selected>--Select Category--</option>
									<option value="InformationTechnology">Information
										Technology</option>
									<option value="Doctor">Doctor</option>
									<option value="Teacher">Teacher</option>
									<option value="Nurse">Nurse</option>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label>Status</label> <select name="status" class="form-control">
									<option selected>--None--</option>
									<option value="Active">Active</option>
									<option value="Inactive">Inactive</option>
								</select>
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="date" class="col-form-label text-left">Select
									Last Date To Apply</label>
							</div>
							<div class="form-group col-md-6">
								<input type="date" name="lastDate"
								required class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label>Job Description</label>
							<textarea required rows="6" cols="" name="jobDescription"
								class="form-control"></textarea>
						</div>
						<button class="btn btn-success">Post Job</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- To import the footer -->
	<%@include file="StaticComponents/Footer.jsp"%>
</body>
</html>