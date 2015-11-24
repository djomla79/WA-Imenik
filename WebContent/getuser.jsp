<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="imenik.User" import="java.sql.*"
	import="imenik.UserDaoImp" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretraga</title>
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
  
  <nav class="navbar navbar-inverse" style="border-radius: 0px;">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" style="color: #e3e3e3;" href="#">Imenik</a>
	    </div>
	    <div>
	      <ul class="nav navbar-nav">
	        <li><a href="userpage.jsp">User Page</a></li>
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
     
      <form action="GetUserServlet" method="post" id="getuser">
          
          <div class="row">
	          <label for="ime">Ime: </label><br />
	          <input type="text" name="ime" placeholder="Ime"><br />
	          <label for="prezime">Prezime: </label><br />
	          <input type="text" name="prezime" placeholder="Prezime">
          </div><br />
          
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
	     <div id="message">
	         <c:out value="${message}" />
	     </div>
      </div>
    </div>
    
    <div class="container3"></div>
    
</body>
</html>