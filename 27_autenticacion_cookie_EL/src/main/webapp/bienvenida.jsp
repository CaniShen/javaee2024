<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Ficha"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%--recuperamos el atributo de petición ficha,y mostramos sus datos
	 --%>
	
	<h2>Usuario: ${session.Scope.ficha.usuario}</h2>
	<h2>Email:${session.Scope.ficha.email}</h2>
	<h2>Edad:${session.Scope.ficha.edad} %></h2>
	
	
	
		<a href="login.html">Volver</a>
	</center>
</body>
</html>