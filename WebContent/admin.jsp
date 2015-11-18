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
<title>Admin Page</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css-data/style.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
    
	<div class="container">
	 <div class="well"><h2>Dobrodosli, ${admin.ime} ${admin.prezime}</h2></div>
		<div id="header2">
			<div id="text" style="font-size: 30px"><b>Administrator</b></div>
	</div>
		<div id="log">
			<ul>
				<li><a href="GetAllUsersServlet">Lista svih korisnika</a></li>
				<li><a href="getuser.jsp">Ispis korisnika po imenu i prezimenu</a></li>
				<li><a href="deleteuser.jsp">Brisanje korisnika</a></li>
				<li><a href="updateuser.jsp">Update korisnika</a></li>
			</ul>
		</div>
	 </div>
	 
</body>
</html>