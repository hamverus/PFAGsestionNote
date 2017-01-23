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
	<title>Espace Chef Departement</title>

</head>
<body>

<ul class="nav nav-tabs">
	<li role="presentation"><a href="/PFAGestionNote/ChefDepartement/">Accueil</a></li>
	<li role="presentation"><a href="<c:url value='/ChefDepartement_Coordinateur'/>">Liste Coordinateur</a></li>
  	<li role="presentation" class="active"><a href="<c:url value='/ChefDepartement_Section'/>">Liste Sections</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_PlanEtude'/>">Liste Plan Etude</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_Matiere'/>">Liste Matieres</a></li>
</ul>

<a href="add/section"><button style="width: 80px;margin-left: 1100px;margin-top: 10px;" data-toggle="tooltip" data-placement="left" title="Ajouter une section !"><i class="fa fa-plus" aria-hidden="true"></i></button></a>
<h1>Liste Sections :</h1>
<c:if test="${!empty listSections}">
    <table class="table table-hover">
    <tr>
    	<th>ID</th>
        <th>Nom de section</th>
        <th>Plan Etude</th>
        <th>Modifier</th>
        <th>Supprimer</th>
        <th></th>
    </tr>
    <c:forEach items="${listSections}" var="section">
        <tr>
        	<td>${section.id}</td>
            <td>${section.nom}</td>
            <td><a href="ChefDepartement/PlanEtude_section/${section.id}">${section.planEtude.id}</a></td>
            <td><a href="<c:url value='/section/edit/${section.id}' />" ><i class="fa fa-edit" aria-hidden="true"></i></a></td>
            <td><a href="<c:url value='/section/remove/${section.id}' />" ><i class="fa fa-close" aria-hidden="true"></i></a></td>
        	<td><a href="<c:url value='/add/planEtude/${section.id}' />" >Ajouter Plan Etude</a></td>

        </tr>
    </c:forEach>
    </table>
</c:if>


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
</body>
</html>