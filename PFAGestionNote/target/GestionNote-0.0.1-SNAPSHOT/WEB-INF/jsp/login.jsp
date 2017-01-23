<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified font-awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<div align=center>
		<img
			src="http://el5edma.com/wp-content/uploads/2014/12/1024e315-79f8-4620-996f-2dc000182fab.png" />

		<h2 style="font-style: italic; font-family: cursive;">Gestion des
			notes</h2>

		<div style="width: 500px; border: solid">
			<div style="width: 300px">
				<form action="j_spring_security_check" method="POST">
					<div class="form-group">
						<label for="exampleInputEmail1">Login</label> <input type="text"
							name="j_username" class="form-control" id="exampleInputEmail1"
							placeholder="login">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" name="j_password" class="form-control"
							id="exampleInputPassword1" placeholder="Password">
					</div>
					<button type="submit" value="Login" class="btn btn-default">Connecter</button>
				</form>

			</div>
		</div>

	</div>

	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous"></script>

</body>
</html>