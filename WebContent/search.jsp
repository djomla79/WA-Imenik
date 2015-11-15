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
<title>Pretraga</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css-data/style.css">
</head>
<body>
     <nav class="navbar navbar-inverse" style="border-radius: 0px;">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" style="color: #e3e3e3;" href="#">Imenik</a>
	    </div>
	    <div>
	      <ul class="nav navbar-nav">
	        <li><a href="userpage.jsp">User Page</a></li>
 	    <li><a href="logout"></a></li>
 	    </ul>
	    </div>
	  </div>
	</nav>
	
     <div id="header">
     <h1>Pretraga</h1>
  </div>
    <div class="row">
    <div class="well">Unesite (ime, prezime, telefon, adresu, datum rodjenja ili pol korisnika) </div>
     </div>
     
    <div class="container" >
      <div class="container1">
     
      <form action="SearchServlet" method="post">
          
          <div class="row">Search <br /><input type="text" name="search" placeholder="Search" required></div><br />
         
          
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