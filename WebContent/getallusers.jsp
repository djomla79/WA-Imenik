<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista svih korisnika</title>
<!-- Bootstrap -->
<link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css-data/userloged.css">
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
	
	<div class="jumbotron">
		<div class="container">
			<div id="text">
				Imenik
			</div>
		</div>
	</div>
	
	<div class="container">
		<div id="header1">Korisnici</div>
   
	<table class="table table-striped">
	    <thead>
	      <tr>
	          <th> Ime </th>
	          <th> Prezime </th> 
	          <th> Telefon </th>
	          <th> Adresa </th>
	          <th> E-mail </th>
	          <th> Datum rodjenja </th>
	          <th> Pol </th>
	      </tr>
        </thead>
    
    <tbody>
           <c:forEach items="${users}" var="user">
           <tr> 
                <td><c:out value="${user.ime}" /></td>
                <td><c:out value="${user.prezime}" /></td>
                <td><c:out value="${user.telefon}" /></td>
                <td><c:out value="${user.adresa}" /></td>
                <td><c:out value="${user.email}" /></td>
                <td><c:out value="${user.rodjenje}" /></td>
                <td><c:out value="${user.pol}" /></td>
           </tr>
           </c:forEach>
	</tbody>
	
    <tfoot>
     <tr>
       <td colspan="7" style="text-align: center;">The end</td>
     </tr>
    </tfoot>
    
   </table>
   </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>