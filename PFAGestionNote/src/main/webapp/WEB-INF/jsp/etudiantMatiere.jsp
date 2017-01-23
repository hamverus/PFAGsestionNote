<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="src/main/webapp/WEB-INF/static/css/bootstrap.min.css" />" media="all" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Espace Etudiant</title>
	
<!-- Latest compiled and minified font-awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
</head>
<body>

<ul class="nav nav-tabs">
	<li role="presentation"><a href="/PFAGestionNote/Etudiant/">Accueil</a></li>
	<li role="presentation"><a href="/PFAGestionNote/Etudiant/profile">Profile</a></li>
  	<li role="presentation" class="active"><a href="<c:url value='/Etudiant_Matiere'/>">Liste Matiere</a></li>
<li role="presentation"><a href="/PFAGestionNote/logout">Déconnecter</a></li>
</ul>

<a href="add/matiere"><button style="width: 80px;margin-left: 1100px;margin-top: 10px;" data-toggle="tooltip" data-placement="left" title="Ajouter une section !"><i class="fa fa-plus" aria-hidden="true"></i></button></a>
<h1>Liste Matieres :</h1>
<c:if test="${!empty listMatieres}">
    <table class="table table-hover">
    <tr>
        <th>Nom de matiere</th>
        <th>Nombre d'heures</th>
        <th>Coefficient</th>
        <th>Semestre</th>
        <th>Absence</th>
        <th>Ds</th>
        <th>Autre Note</th>
        <th>Examen</th>
        <th>Moyenne</th>
    </tr>
    <c:forEach items="${listMatieres}" var="matiere">
        <tr>
            <td>${matiere.nom}</td>
            <td>${matiere.nbHeures}</td>
            <td>${matiere.coefficient}</td>
            <td>${matiere.semestre}</td>
            <td>0</td>
            <td>pas encore</td>
            <td>pas encore</td>
            <td>pas encore</td>
            <td>pas encore</td>
         </tr>
    </c:forEach>
    </table>
</c:if>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>
</html>