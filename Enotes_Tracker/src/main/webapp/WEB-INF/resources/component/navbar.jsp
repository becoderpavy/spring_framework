<!-- Start navbar -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"><i class="fa-solid fa-book"></i>
			Enotes</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="${pageContext.request.contextPath}/home"><i class="fa-solid fa-house"></i>
						Home</a></li>

				<c:if test="${not empty userObj }">
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/user/addNotes">Add
							Notes</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/user/viewNotes">View
							Notes</a></li>
				</c:if>
			</ul>

			<form class="d-flex">
				<c:if test="${empty userObj }">
					<a href="${pageContext.request.contextPath}/login" class="btn btn-light me-2" type="submit">Login</a>
					<a href="${pageContext.request.contextPath}/register" class="btn btn-light" type="submit">Register</a>
				</c:if>
				<c:if test="${not empty userObj }">
					<a href="#" class="btn btn-light me-2" type="submit"><i
						class="fa-solid fa-user"></i> ${userObj.fullname }</a>
					<a href="${pageContext.request.contextPath}/user/logout" class="btn btn-light" type="submit">Logout</a>
				</c:if>

			</form>

		</div>
	</div>
</nav>

<!-- End Navbar  -->