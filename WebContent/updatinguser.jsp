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
    <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css-data/style.css">
    <!-- jQuery for Bootstrap and jQuery validation -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    <script src ="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script> 
	<script src="jquery-data/validate.js"></script>
</head>
<body>
     <nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div>
	      <ul class="nav navbar-nav">
	        <li><a href="admin.jsp">Admin Page</a></li>
	        <li><a href="/WA-Imenik/LogOutServlet">Odjava</a></li>
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
     
      <form action="UpdateServlet" method="post" id="updating">
      
          <div class="row">
              <label>Ime: </label><br />
              <input type="text" name="ime" placeholder="${user.ime}"><br />
              <label>Prezime: </label><br />
              <input type="text" name="prezime" placeholder="${user.prezime}"><br />
              <label>Telefon: </label><br />
              <input type="text" name="telefon" placeholder="${user.telefon}"><br />
              <label>Adresa: </label><br />
              <input type="text" name="adresa" placeholder="${user.adresa}"><br />
              <label>E-mail: </label><br />
              <input type="email" name="email" placeholder="${user.email}"><br />
              <label>Datum rodjenja: </label><br />
              <input type="text" name="rodjenje" placeholder="${user.rodjenje}"><br />
              <label>Pol: </label><br />
              <input type="text" name="pol" placeholder="${user.pol}"><br />
              <label>Korisnicko ime: </label><br />
              <input type="text" name="username" placeholder="${user.username}"><br />
              <label>Lozinka: </label><br />
              <input type="password" name="password" placeholder="${user.password}">
          </div><br />
          
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      
      </div>
    </div>
    
</body>
</html>