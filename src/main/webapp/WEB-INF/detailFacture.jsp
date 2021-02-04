<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Détail de facture !</title>
    <%@include file="commons/header.jsp"%>

</head>
<body>
<%@include file="commons/menu.jsp"%>

<h2>Détails de facture</h2>

<ul class="collection with-header">
    <li class="collection-item"><div>Date de facturation : <c:out value="${facture.date}"/><span class="secondary-content"><c:out value="${facture.client.nom}" /></span></div></li>
    <li class="collection-item"><div>Numéro de facture : <c:out value="${facture.numero}"/><span class="secondary-content"><c:out value="${facture.client.adresse}" /></span></div></li>
</ul>

<table>
    <thead>
    <tr>
        <th>Article</th>
        <th>Quantité</th>
        <th>Prix</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${facture.listeLigneFact}" var="ligne">
        <tr>
            <td>
                <c:out value="${ligne.article.nom}"/>
            </td>
            <td>
                <c:out value="${ligne.quantite}"/>
            </td>
            <td>
                <c:out value="${ligne.prix}"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<strong>Total : <c:out value="${facture.prix}"/> EUROS</strong>

<%@include file="commons/footer.jsp"%>

</body>
</html>