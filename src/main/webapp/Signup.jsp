<!DOCTYPE html>
<html>
<head>
<title>Register</title>

<%@include file="StaticComponents/LoadCSS.jsp"%>
</head>
<body style="background-color: #fcffe9">

	<!-- To import the navbar -->
	<%@include file="StaticComponents/Navbar.jsp"%>
	<!-- signup body -->
	<div class="container-fluid">
		<div class="row p-5">
			<div class="col-md-4 offset-md-4 m-6">
				<div class="card" style="background-color: #fcffe9; border: 0px;">
					<div class="card-body">
						<div class="text-center">
							<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
							<h5>Registration</h5>
						</div>
						<!-- <c:if test="${not empty successMsg }">
							<h4 class="text-center text-danger">${successMsg}</h4>
							<c:remove var="successMsg" />
						</c:if> -->

						<form action="register" method="post">
							<div class="form-group">
								<label>Full Name </label> <input type="text" required="required"
									class="form-control" id="inputEmail1"
									aria-describedby="emailHelp" name="userName">
							</div>

							<div class="form-group">
								<label>Email</label> <input type="email" required="required"
									class="form-control" id="inputEmail1"
									aria-describedby="emailHelp" name="userMail">
							</div>

							<div class="form-group">
								<label for="inputPassword1">Password</label> <input
									type="password" required="required" class="form-control"
									id="inputPassword1" name="userPassword">
							</div>
							<div class="form-row">
								<div class="form-group col-md-4">
									<label>User Role</label> <select name="Role"
										class="custom-select" id="inlineFormCustomSelectPref">
										<option selected>--Select Role--</option>
										<option value="Recruiter">Recruiter (HR)</option>
										<option value="Applicant">Applicant</option>
									</select>
								</div>
							</div>

							<button type="submit"
								class="btn btn-primary badge-pill btn-block">SignUp</button>
						</form>
						<p class="text-dark p-4 text-center">
							Already Have Account? Click Here To <a href="Login.jsp"
								class="text-primary">LogIn</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- To import the footer -->
	<%@include file="StaticComponents/Footer.jsp"%>
</body>
</html>