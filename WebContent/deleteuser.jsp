<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="imenik.User" import="java.util.*"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete User</title>
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
	        <li><a href="admin.jsp">Admin</a></li>
	        <li><a href="/WA-Imenik/LogOutServlet">Odjava</a></li>
 	    </ul>
	    </div>
	  </div>
	</nav>

    <div id="header">
     <h1>Brisanje korisnika</h1>
     </div>
     
     <div class="row">
         <div class="well"><h2>Molimo vas da unesete korisnicko ime korisnika kojeg zelite obrisati</h2></div>
     </div>
    <div class="container" >
      <div class="container1">
     
      <form action="DeleteUserServlet" method="post" id="delete">
          
          <div class="row">
	          <label for="username">Korisnicko ime:</label> <br />
	          <input type="text" name="username" placeholder="Korisnicko ime">
          </div><br />
          
          <button class="btn btn-md btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      </div>
    </div>
    
</body>
</html>