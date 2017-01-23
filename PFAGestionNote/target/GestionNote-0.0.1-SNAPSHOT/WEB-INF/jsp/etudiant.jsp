<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified font-awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Espace Coordinateur</title>

</head>
<body>

<ul class="nav nav-tabs">
	<li role="presentation"><a href="/PFAGestionNote/Coordinateur/">Accueil</a></li>
	<li role="presentation"><a href="/PFAGestionNote/Coordinateur/">Profile</a></li>
  	<li role="presentation" class="active"><a href="<c:url value='/Coordinateur_Etudiants'/>">Liste Etudiants</a></li>
  	<li role="presentation"><a href="<c:url value='/Coordinateur_Enseignants'/>">Liste Enseignants</a></li>
  	<li role="presentation"><a href="<c:url value='/Coordinateur_Groupes'/>">Liste Groupes</a></li>
</ul>

<a href="add/etudiant"><button style="width: 80px;margin-left: 1100px;margin-top: 10px;" data-toggle="tooltip" data-placement="left" title="Ajouter une Etudiant !"><i class="fa fa-plus" aria-hidden="true"></i></button></a>

<h1>Liste Etudiants :</h1>
<c:if test="${!empty listEtudiants}">
    <table class="table table-hover">
    <tr>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Email</th>
        <th>Telephone</th>
        <th>Numero d'inscrit</th>
        <th>Groupe</th>
        <th width="60">Modifier</th>
        <th width="60">Supprimer</th>
    </tr>
    <c:forEach items="${listEtudiants}" var="etudiant">
        <tr>
            <td>${etudiant.nom}</td>
            <td>${etudiant.prenom}</td>
            <td>${etudiant.email }</td>
            <td>${etudiant.tel }</td>
            <td>${etudiant.numInsc }</td>
            <td>${etudiant.groupe.nom }</td>
            <td><a href="<c:url value='etudiant/edit/${etudiant.id}' />" ><i class="fa fa-edit" aria-hidden="true"></i></a></td>
            <td><a href="<c:url value='etudiant/remove/${etudiant.id}' />" ><i class="fa fa-close" aria-hidden="true"></i></a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
</body>
</html>