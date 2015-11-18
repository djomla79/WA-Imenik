<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>User Input Data</title>
    <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css-data/style.css">
    <!-- jQuery for Bootstrap and jQuery validation -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    <script src ="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script> 
	<script src="jquery-data/validate.js"></script>
</head>
<body>
     <div class="header">
     <h1><strong>Unos podataka novog korisnika</strong></h1>
     </div>
     
     <p id="reg"><b>Registracija</b></p>
     
    <div class="container" >
      <div class="container1">
     
      <form id="signup" action="signupservlet" method="post">
          
          <div class="row">
          	  <label for="ime">Ime: </label><br />
          	  <input type="text" name="ime" placeholder="Ime" class="required" title="Molimo, unesite svoje ime."><br />
	          <label for="prezime">Prezime: </label><br />
	          <input type="text" name="prezime" placeholder="Prezime" class="required" title="Molimo, unesite svoje prezime."><br />
	          <label for="telefon">Telefon: </label><br />
	          <input type="text" name="telefon" placeholder="Telefon" class="required" title="Molimo, unesite vas broj telefona."><br />
	          <label for="adresa">Adresa: </label><br />
	          <input type="text" name="adresa" placeholder="Adresa" class="required" title="Molimo, unesite svoju adresu."><br />
	          <label for="email">E-mail: </label><br />
	          <input type="email" name="email" placeholder="Ime"><br />
	          <label for="rodjenje">Datum rodjenja: </label><br />
	          <input type="text" name="rodjenje" placeholder="Datum rodjenja" title="Unesite datum rodjenja koristeci format: 01/01/1900"><br />
	          <label for="pol">Pol: </label><br />
	          <input type="text" name="pol" placeholder="Pol" class="required" title="Unesite svoj pol: musko - zensko."><br />
	          <label for="username">Korisnicko ime: </label><br />
	          <input type="text" name="username" placeholder="Korisnicko ime"><br />
	          <label for="password">Lozinka: </label><br />
	          <input type="password" name="password" placeholder="Lozinka">
          </div><br />
          
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      </div>
    </div>
    
</body>
</html>