<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<center>
			Isbn:<input type="text" id="isbn" name="isbn" placeholder="isbn"><br>
			Título:<input type="text" id="titulo" name="titulo" ><br>
			Autor:<input type="text" id="autor" name="autor" placeholder="autor"> <br>
			Precio:<input type="text" id="precio" name="precio" placeholder="precio"> <br>
			Páginas:<input type="text" id="paginas" name="paginas" placeholder="paginas"> <br>
			Temático: <select id="tematica" >
							<c:forEach var="t" items="${requestScope.temas}">
								<option value="${t.idTema }">${t.nombreTema }</option>
							</c:forEach>>	
						</select>

			<input type="button" value="Alta" id="alta">
			<br><br>
			<a href="FrontController?operation=doIndex">Volver</a>	
	</center>
	<script type="text/javascript">
		$("#alta").click(function() {
			var url="FrontController";
			var params={"operation":"doAltaLibro",
					"isbn":$("#isbn").val(),
					"titulo":$("#titulo").val(),
					"autor":$("#autor").val(),
					"precio":$("#precio").val(),
					"paginas":$("#paginas").val(),
					"idTema":$("#tematica").val()};
			$.get(url,params,function(data){
	
				let mensaje;
				if(data=="true") {
					mensaje="Libro añadido!";
				}else{
					mensaje="ISBN duplicado!!, no se ha añadir el libro";
				}
				alert(mensaje);

		});
	});

	</script>
</body>
</html>