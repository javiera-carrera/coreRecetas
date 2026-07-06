<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Explorador de Recetas</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Nuestras Recetas</h1>
    <ul>
        <c:forEach var="receta" items="${listaRecetas}">
            <li>
                <a href="/recetas/${receta}"><c:out value="${receta}"/></a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>