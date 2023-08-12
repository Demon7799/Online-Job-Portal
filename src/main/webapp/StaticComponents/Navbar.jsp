 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false" %>
 
<!-- Directly copied from bootstrap and modified -->
<nav class="navbar navbar-expand-lg navbar-dark bg-custom">
  <a class="navbar-brand" href="index.jsp"><i>Art2Hire</i></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#"><i class="fa-solid fa-house mr-1"></i>Home <span class="sr-only">(current)</span></a>
      </li>
      <c:if test="${userObject.role eq 'recruiter' }">
      <li class="nav-item">
        <a class="nav-link" href="PostNewJob.jsp"><i class="fa-solid fa-circle-plus mr-1"></i>New Job</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="ViewAllJobs.jsp"><i class="fa-solid fa-eye mr-1"></i>View Jobs</a>
      </li>
      </c:if>
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <a href="Login.jsp" class="btn btn-light mr-3"><i class="fa-solid fa-right-to-bracket mr-1"></i>Login</a>
      <a href="Signup.jsp" class="btn btn-light"><i class="fa-solid fa-address-card mr-1"></i>SignUp</a>
    </form>
  </div>
</nav>