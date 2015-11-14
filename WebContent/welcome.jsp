<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dobrodosli u imenik aplikaciju</title>
<!-- Bootstrap -->
<link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css-data/style.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="jumbotron">
		<div class="container">
			<div id="text"><h2>Dobrodosli u Imenik aplikaciju</h2></div>
		</div>
	</div>
	
	<div class="container">
		<div id="header1">
			<div id="text">Da bi se registrovali, izaberite opciju sign-up.</div>
			<div id="text">Ako ste vec registrovani, izaberite opciju log-in.</div>
		</div>
		<div id="log">
			<ul>
				<li><a href="signupuser.jsp">Sign up</a></li>
				<li><a href="login.jsp">Log in</a></li>
			</ul>
		</div>
	</div>
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>