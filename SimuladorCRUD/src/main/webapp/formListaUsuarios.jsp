<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Usuários</title>
</head>
<body>

Lista de usuários cadastrados:

<ol>
<c:forEach items="${usuarios}" var="usuario"></c:forEach>
<li>${usuario.nome} - ${usuario.email} -
<fmt:formatDate value="${usuario.dataCadastro}"/>

</ol>
<a href="/SimuladorCRUD/novoUsuario">Novo</a>
</body>
</html>