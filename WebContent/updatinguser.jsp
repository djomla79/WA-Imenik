<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="imenik.User" import="java.sql.*"%>
	<%@ page import="imenik.UserDaoImp" import="java.util.*"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update user</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css-data/style.css">
</head>
<body>
     <nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div>
	      <ul class="nav navbar-nav">
	        <li><a href="admin.jsp">Admin Page</a></li>
 	    </ul>
	    </div>
	  </div>
	</nav>
	
     <div class="header">
     <h1>Update korisnika</h1>
  </div>
  
    <div class="well">Unos podataka</div>
     
    <div class="container" >
      <div class="container1">
     
      <form action="UpdateServlet" method="post">
      
          <div class="row">
          <label>Ime: </label><br /><input type="text" name="ime" placeholder="${user.ime}" required><br />
          <label>Prezime: </label><br /><input type="text" name="prezime" placeholder="${user.prezime}" required><br />
          <label>Telefon: </label><br /><input type="text" name="telefon" placeholder="${user.telefon}" required><br />
          <label>Adresa: </label><br /><input type="text" name="adresa" placeholder="${user.adresa}" required><br />
          <label>E-mail: </label><br /><input type="email" name="email" placeholder="${user.email}" required><br />
          <label>Datum rodjenja: </label><br /><input type="text" name="rodjenje" placeholder="${user.rodjenje}" required><br />
          <label>Pol: </label><br /><input type="text" name="pol" placeholder="${user.pol}" required><br />
          <label>Lozinka: </label><br /><input type="password" name="password" placeholder="${user.password}" required>
          </div><br />
          
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      </div>
    </div>
     
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>