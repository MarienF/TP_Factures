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

<h2>Liste des factures</h2>

<table>
    <thead>
    <tr>
        <th>Numero</th>
        <th>Date</th>
        <th>Client</th>
        <th>Prix</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${factures}" var="facture">
        <tr>
            <td>
                <c:out value="${facture.numero}"/>
            </td>
            <td>
                <c:out value="${facture.date}"/>
            </td>
            <td>
                <c:out value="${facture.client.nom}"/>
            </td>
            <td>
                <c:out value="${facture.prix}"/>
            </td>
            <td>
                <a href="facture/detail?id=<c:out value="${facture.id}"/>">+</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@include file="commons/footer.jsp"%>

</body>
</html>