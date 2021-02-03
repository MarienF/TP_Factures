<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>nouvel article !</title>
    <%@include file="commons/header.jsp"%>
</head>
<body>
<%@include file="commons/menu.jsp"%>

<h2>Création d'un article</h2>

<form action="create" method="post">
    <label for="nomArticle">Nom</label> <input type="text" name="nomArticle" />
    <label for="prixArticle">Prix</label> <input type="text" name="prixArticle" />

    <input type="submit" value="Valider">
</form>
<%@include file="commons/footer.jsp"%>

</body>
</html>