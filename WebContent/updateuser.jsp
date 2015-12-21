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
	        <li><a href="admin.jsp">Admin</a></li>
	        <li><a href="/WA-Imenik/LogOutServlet">Odjava</a></li>
 	    </ul>
	    </div>
	  </div>
	</nav>
	
	<div class="container" >
     <div id="header">
     <h1>Update korisnika</h1>
  </div>
  </div>
    <div class="well"><h4>Unos Korisnika kojeg zelimo update-ovati</h4></div>
     
    <div class="container" >
      <div class="container1">
     
      <form action="UpdateServletUsername" method="post" id="update">
      
          <div class="row">Unesite korisnicko ime<br />
          <input type="text" name="username" placeholder="Korisnicko ime"></div><br />
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      </div>
      <div id="message">
          <c:out value="${message}" />
      </div>
    </div>
     
</body>
</html>