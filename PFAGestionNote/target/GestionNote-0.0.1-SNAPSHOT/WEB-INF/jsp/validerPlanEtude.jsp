<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="src/main/webapp/WEB-INF/static/css/bootstrap.min.css" />" media="all" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Espace Directeur Etude</title>
	
<!-- Latest compiled and minified font-awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
</head>
<body>

<ul class="nav nav-tabs">
	<li role="presentation"><a href="/PFAGestionNote/DirecteurEtude/">Accueil</a></li>
	<li role="presentation"><a href="/DirecteurEtude/Profile">Profile</a></li>
	<li role="presentation"  class="active"><a href="<c:url value='/DirecteurEtude/sections'/>">Liste Sections</a></li>
</ul>

<h1>C'est le plan d'étude de la section : ${section.nom}</h1>
<table class="table table-hover">
<tr>
    	<th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
</tr>
<c:forEach items="${listModules}" var="module">
        <tr style="background-color: #D1CECD">
            <td>Nom : ${module.nom}</td>
            <td>Coefficient :${module.coefficient}</td>
            <td></td>
            <td></td>
        </tr>
<div align="center">
   			<div align="center" style="width: 300px">

          <c:forEach items="${listMatieres}" var="matiere">
          <c:if test="${matiere.module.id == module.id }">
        <tr>
            <td>Matiere : ${matiere.nom}</td>
            <td>Coefficient :${matiere.coefficient}</td>
            <td>Nombre d'heures :${matiere.nbHeures}</td>
            <td>Semestre :${matiere.semestre}</td>
        </tr>
        </c:if>
    </c:forEach>
    </div>
    </div>
</c:forEach>
</table>
<a href="#"><button style="width: 140px;margin-left: 1100px;margin-top: 10px;">Valider Plan Etude</button></a>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
</body>
</html>