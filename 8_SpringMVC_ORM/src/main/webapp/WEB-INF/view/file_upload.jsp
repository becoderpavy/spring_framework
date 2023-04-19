<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="container text-center">
		<h1>File Uploading Example</h1>
		<form action="fileUpload" enctype="multipart/form-data" method="post">
			<div class="mb-3 col-md-6 offset-md-3 mt-4">
				<input type="file" name="img" class="form-control">
			</div>
			<div class="mb-3 col-md-4 offset-md-4 mt-4">
				<button class="btn btn-primary">Upload</button>
			</div>
		</form>
	</div>
</body>
</html>