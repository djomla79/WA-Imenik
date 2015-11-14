<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="imenik.User" import="java.sql.*"%>
	<%@ page import="imenik.UserDaoImp" import="java.util.*"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
<!-- Bootstrap -->
    
    <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css-data/login.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body>

    <div class="container">

      <form action="loginservlet" method="post" class="form-login">
        <h2 class="form-login-heading">Unesite korisnicko ime i lozinku</h2>
        Korisnicko ime<br />
        <input type="text" name="username" placeholder="korisnicko ime" required><br />
        Lozinka<br />
        <input type="password" name="password" placeholder="lozinka" required><br />
        
        <button class="btn btn-md btn-primary btn-block" type="submit">Log in</button>
      </form>

    </div>
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>