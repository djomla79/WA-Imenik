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
<title>User Page</title>
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
	        <li><a href="/WA-Imenik/LogOutServlet">Odjava</a></li>
 	    </ul>
	    </div>
	  </div>
	</nav>
     
	<div class="container">
	 <div class="well"><h2><strong>Dobrodosli, ${user.ime} ${user.prezime}</strong></h2></div>
		<div id="header2">
			<div id="text" style="font-size: 30px">Korisnik</div>
		</div>
		<div id="log">
			<ul>
				<li><a href="search.jsp">Pretraga</a></li>
			</ul>
		</div>
		<div id="message">
		    <c:out value="${message}" />
		</div>
	 </div>
	 
</body>
</html>