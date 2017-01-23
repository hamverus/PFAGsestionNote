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
	<li role="presentation"><a href="/PFAGestionNote/ChefDepartement/">Accueil</a></li>
	<li role="presentation" class="active"><a href="<c:url value='/ChefDepartement_Coordinateur'/>">Liste Coordinateurs</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_Section'/>">Liste Sections</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_PlanEtude'/>">Liste Plans Etude</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_Matiere'/>">Liste Matieres</a></li>
</ul>

<a href="add/coordinateur"><button style="width: 80px;margin-left: 1100px;margin-top: 10px;" data-toggle="tooltip" data-placement="left" title="Ajouter une coordinateur !"><i class="fa fa-plus" aria-hidden="true"></i></button></a>

<h1>Liste Coordinateurs :</h1>
<c:if test="${!empty listCoordinateurs}">
    <table class="table table-hover">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Email</th>
        <th>Tel</th>
        <th>Matricule</th>
        <th>Modifier</th>
        <th>Supprimer</th>
    </tr>
    <c:forEach items="${listCoordinateurs}" var="coordinateur">
        <tr>
            <td>${coordinateur.id}</td>
            <td>${coordinateur.nom}</td>
            <td>${coordinateur.prenom}</td>
            <td>${coordinateur.email }</td>
            <td>${coordinateur.tel }</td>
            <td>${coordinateur.numMatricule }</td>
            <td><a href="<c:url value='coordinateur/edit/${coordinateur.id}' />" ><i class="fa fa-edit" aria-hidden="true"></i></a></td>
            <td><a href="<c:url value='coordinateur/remove/${coordinateur.id}' />" ><i class="fa fa-close" aria-hidden="true"></i></a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>

</body>
</html>