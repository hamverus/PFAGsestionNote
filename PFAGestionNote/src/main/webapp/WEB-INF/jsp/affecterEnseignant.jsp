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
	<li role="presentation" ><a href="/PFAGestionNote/ChefDepartement/">Accueil</a></li>
	<li role="presentation"><a href="<c:url value='/ChefDepartement_Coordinateur'/>">Liste Coordinateurs</a></li>
  	<li role="presentation" class="active"><a href="<c:url value='/ChefDepartement_Section'/>">Liste Sections</a></li>
  	<li role="presentation"><a href="/PFAGestionNote/logout">Déconnecter</a></li>
</ul>


<h1>Matiere ${matiere.nom }</h1>
<div style="margin-left: 150px;margin-right: 150px">
<br><br>
<form:form action="/PFAGestionNote/ChefDepartement/PlanEtude_section/affecter" method="POST" commandName="matiere" class="form-group">
<fieldset>
 <legend>Modifier Matiere</legend>
 <div align="center">
    <div align="center" style="width: 300px">
			<form:hidden path="id" />
			
			
			<form:hidden path="nom" /><br>
			
			<form:hidden path="nbHeures" /><br>
			
			<form:hidden path="coefficient" /><br>
			<form:select path="mId" >
				<form:option value="">Selectionner un Enseignant</form:option>		
				<form:options items="${listEnseignant}" itemValue="id" itemLabel="nom"/>
			</form:select><br>
			<form:input path="module.id" />
			<form:hidden path="semestre" />
			<input type="submit" name="action" value="Affecter" class="form-control" style="background-color: #EFECCA"/>
</div>
</div>
</fieldset>
</form:form>
</div>

</body>
</html>