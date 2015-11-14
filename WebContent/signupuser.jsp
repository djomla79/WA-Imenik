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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.validate.min.js"></script>
    <script src="jquery-data/validate.js"></script>
    <script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
</head>
<body>
     <div class="header">
     <h1><strong>Unos podataka novog korisnika</strong></h1>
     </div>
     
     <p id="reg"><b>Registracija</b></p>
     
    <div class="container" >
      <div class="container1">
     
      <form id="jq" action="signupservlet" method="post">
          
          <div class="row"><label>Ime: </label><br /><input type="text" name="ime"><br />
          <label>Prezime: </label><br /><input type="text" name="prezime"><br />
          <label>Telefon: </label><br /><input type="text" name="telefon"><br />
          <label>Adresa: </label><br /><input type="text" name="adresa"><br />
          <label>E-mail: </label><br /><input type="email" name="email"><br />
          <label>Datum rodjenja: </label><br /><input type="text" name="rodjenje"><br />
          <label>Pol: </label><br /><input type="text" name="pol"><br />
          <label>Korisnicko ime: </label><br /><input type="text" name="username"><br />
          <label>Lozinka: </label><br /><input type="password" name="password"></div><br />
          
          <button class="btn btn-lg btn-primary btn-block" type="submit">Potvrdi</button> 
          
      </form>
      </div>
    </div>
    
</body>
</html>