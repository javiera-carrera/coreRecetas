<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle de la Receta</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

    <c:choose>
        <%-- Si los ingredientes no son nulos, significa que la receta existe --%>
        <c:when test="${ingredientes != null}">
            <h1>Ingredientes para: <c:out value="${nombreReceta}"/></h1>
            <ul>
                <c:forEach var="ingrediente" items="${ingredientes}">
                    <li><c:out value="${ingrediente}"/></li>
                </c:forEach>
            </ul>
        </c:when>
        
        <%-- Si son nulos, mostramos el mensaje de error solicitado --%>
        <c:otherwise>
            <p class="error">La receta "${nombreReceta}" no se encuentra en nuestra lista.</p>
        </c:otherwise>
    </c:choose>

    <br>
    <a href="/recetas">⬅ Volver al catálogo</a>
</body>
</html>