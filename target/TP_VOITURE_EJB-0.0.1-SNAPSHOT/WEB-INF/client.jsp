<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Bienvenue !</title>
    <%@include file="commons/header.jsp"%>

</head>
<body>
<%@include file="commons/menu.jsp"%>

<h2>Liste des clients</h2>

<table>
    <thead>
    <tr>
        <th>Nom</th>
        <th>Adresse</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td>
                <c:out value="${client.nom}"/>
            </td>
            <td>
                <c:out value="${client.adresse}"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<div class="nav-wrapper">
    <ul id="nav-mobile" class="hide-on-med-and-down">
        <li><a href="client/create">AJOUTER UN CLIENT</a></li>
    </ul>
</div>

<%@include file="commons/footer.jsp"%>

</body>
</html>