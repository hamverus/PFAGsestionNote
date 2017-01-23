<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="src/main/webapp/WEB-INF/static/css/bootstrap.min.css" />" media="all" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Espace Chef Departement</title>
	
<!-- Latest compiled and minified font-awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
</head>
<body>

<ul class="nav nav-tabs">
	<li role="presentation" class="active"><a href="/PFAGestionNote/ChefDepartement/">Accueil</a></li>
	<li role="presentation"><a href="<c:url value='/ChefDepartement_Coordinateur'/>">Liste Coordinateurs</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_Section'/>">Liste Sections</a></li>
  	
<li role="presentation"><a href="/PFAGestionNote/logout">Déconnecter</a></li>
</ul>
<div style="margin-left: 150px;margin-right: 150px">

<br><br>
<form>
<fieldset>
<legend>Bonjour :<b> ${chefDepartement.nom}  ${chefDepartement.prenom}</b></legend>

<div align="center">
    <div align="center" style="width: 300px">

	<h3> Nom : </h3>
	<b> ${chefDepartement.nom}</b><br>
	<h3>Prenom</h3>
	<b> ${chefDepartement.prenom}</b><br>
	<h3> Poste :</h3>
	<b> Chef de Departement</b><br>
	<h3> Departement :</h3>
	  <b> ${chefDepartement.departement.nom}</b><br>
</div>
</div>
</fieldset>
</form>
</div>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>
</html>