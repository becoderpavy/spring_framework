<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Emp Managment System</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="home">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="addEmp">Add
							Emp</a></li>
				</ul>

			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header text-center">
						<h4>All Emp Details</h4>
						<c:if test="${not empty msg }">
							<h5 class="text-success">${msg }</h5>
							<c:remove var="msg" />
						</c:if>
					</div>
					<div class="card-body">
						<table class="table">
							<thead>

								<tr>
									<th scope="col">Id</th>
									<th scope="col">Full Name</th>
									<th scope="col">Address</th>
									<th scope="col">Email</th>
									<th scope="col">Password</th>
									<th scope="col">Designation</th>
									<th scope="col">Salary</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${empList }" var="emp">
									<tr>
										<th scope="row">${emp.id }</th>
										<td>${emp.fullName }</td>
										<td>${emp.address }</td>
										<td>${emp.email }</td>
										<td>${emp.password }</td>
										<td>${emp.designation}</td>
										<td>${emp.salary }</td>
										<td><a href="editEmp/${emp.id}"
											class="btn btn-sm btn-primary">Edit</a> <a
											href="deleteEmp/${emp.id }" class="btn btn-sm btn-danger">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>