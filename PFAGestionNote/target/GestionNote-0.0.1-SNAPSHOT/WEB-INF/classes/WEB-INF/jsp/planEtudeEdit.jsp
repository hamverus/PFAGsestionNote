<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="src/main/webapp/WEB-INF/static/css/bootstrap.min.css" />" media="all" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title></title>
	
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
	<li role="presentation"><a href="<c:url value='/ChefDepartement_Coordinateur'/>">Liste Coordinateur</a></li>
	<li role="presentation"><a href="/PFAGestionNote/ChefDepartement_Section/">Liste Sections</a></li>
  	<li role="presentation" class="active"><a href="<c:url value='/ChefDepartement_PlanEtude'/>">Liste Plan Etudes</a></li>
  	<li role="presentation"><a href="<c:url value='/ChefDepartement_Matiere'/>">Liste Matieres</a></li>
</ul>

<div style="margin-left: 150px;margin-right: 150px">
<br><br>
<form:form action="/PFAGestionNote/planEtude/edit" method="POST" commandName="planEtude" class="form-group">
 <fieldset>
 <legend>Modifier Plan d'Etude</legend>
 <div align="center">
    <div align="center" style="width: 300px">
			<form:hidden path="id" />
			<p><b>Annee:</b></p>
			<form:input path="annee" class="form-control"/><br>
			<input type="submit" name="action" value="Modifier" class="form-control" style="background-color: #EFECCA"/>
</div>
</div>
</fieldset>
</form:form>
</div>


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>
</html>