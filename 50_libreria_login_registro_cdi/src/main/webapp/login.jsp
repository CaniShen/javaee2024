<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Autenticación de Usuarios</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="styles.css">
<!-- las siguientes etiquetas meta sirven para que el navegador
	no cachee la página
	-->
<meta http-equiv="Expires" content="0">
<meta http-equiv="Last-Modified" content="0">
<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
<meta http-equiv="Pragma" content="no-cache">
</head>
<body>
	<div class="container">
		<div class="login-box">
			<h2>Autenticación de cliente</h2>
			<form action="FrontController?operation=doLogin" method="post">
				<div class="input-group">
					<label for="username">Usuario</label> <input type="text"
						id="username" name="usuario" required>
				</div>
				<div class="input-group">
					<label for="password">Contraseña</label> <input type="password"
						id="password" name="password" required>
				</div>

				<div class="input-group">
					<button type="submit">Enviar</button>
				</div>
				<h3>
					<a href="FrontController?operation=doRegistrar">Registrar</a>
				</h3>

			</form>
		</div>
	</div>
</body>
</html>