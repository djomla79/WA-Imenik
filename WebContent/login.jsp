<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="imenik.User" import="java.sql.*"%>
	<%@ page import="imenik.UserDaoImp" import="java.util.*"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
    <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css-data/login.css">
    <!-- jQuery for Bootstrap and jQuery validation -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    <script src ="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script> 
	<script src="jquery-data/validate.js"></script>
</head>
<body>

    <div class="container">

      <form action="loginservlet" method="post" class="form-login" id="login">
        <h2 class="form-login-heading">Unesite korisnicko ime i lozinku</h2>
        <label for="username">Korisnicko ime:</label><br />
        <input type="text" name="username" placeholder="korisnicko ime"><br />
        <label for="password">Lozinka: </label><br />
        <input type="password" name="password" placeholder="lozinka"><br />
        
        <button class="btn btn-md btn-primary btn-block" type="submit">Log in</button>
      </form>

    </div>
    
</body>
</html>