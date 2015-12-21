<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="imenik.User" import="java.sql.*"%>
	<%@ page import="imenik.UserDaoImp" import="java.util.*"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get User</title>
<!-- Bootstrap -->
    
    <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css-data/style.css" rel="stylesheet">
</head>
<body>
  
  <nav class="navbar navbar-inverse" style="border-radius: 0px;">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" style="color: #e3e3e3;" href="#">Imenik</a>
	    </div>
	    <div>
	      <ul class="nav navbar-nav">
	        <li><a href="admin.jsp">Admin</a></li>
	        <li><a href="/WA-Imenik/LogOutServlet">Odjava</a></li>
 	    </ul>
	    </div>
	  </div>
  </nav>

  <div class="header">
     <h1>Pretraga po imenu i prezimenu.</h1>
  </div>
  
    <div class="well">Unesite ime i prezime korisnika kojeg trazite </div>
     
    <div class="container" >
      <div class="container1">
     
      <form action="GetUserServlet" method="post">
          
          <div class="row">Ime: <br /><input type="text" name="ime" placeholder="Ime"></div><br />
          <div class="row">Prezime: <br /><input type="text" name="prezime" placeholder="Prezime"></div><br />
          
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      </div>
    </div>
    <div class="container3"></div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>