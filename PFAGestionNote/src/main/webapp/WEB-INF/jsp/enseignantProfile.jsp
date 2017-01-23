<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="src/main/webapp/WEB-INF/static/css/bootstrap.min.css" />" media="all" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Espace Enseignabt</title>
	
<!-- Latest compiled and minified font-awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- Optional treme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-treme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
</head>
<body>

<ul class="nav nav-tabs">
	<li role="presentation" ><a href="/PFAGestionNote/Enseignant/">Accueil</a></li>
	<li role="presentation" class="active"><a href="Enseignant/profile">Profile</a></li>
  	<li role="presentation"><a href="<c:url value='/Enseignant/groupes'/>">Liste Groupe</a></li>
<li role="presentation"><a href="/PFAGestionNote/logout">Déconnecter</a></li>
</ul>

<a href="etudiant/edit/${enseignant.id}"><button style="width: 120;margin-left: 1100px;margin-top: 10px;">Modifier Profile</button></a>

<fieldset>
<div style="margin-top: 10%;margin-left: 20%;width: 800px;">

<legend>Profile :</legend>
<div  align="center" >
	
    <table align="center">

        <tr><th width="400">Nom : ${enseignant.nom}</th></tr>
        <tr><th width="400">Prenom : ${enseignant.prenom}</th></tr>
        <tr><th width="400">Email : ${enseignant.email }</th></tr>
        <tr><th width="400">Telephone : ${enseignant.tel }</th></tr>
        <tr><th width="400">Numero d'inscrit : ${enseignant.numMatricule }</th></tr>
        
        
           
    </table>

</div>
</div>
</fieldset>


</body>
</html>