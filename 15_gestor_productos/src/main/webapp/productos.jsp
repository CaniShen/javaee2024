<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.Producto, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Productos de <%=request.getParameter("categoria") %> </h2>
	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>
		<%List<Producto> listProductos=(List<Producto>)request.getAttribute("productos");
		for (Producto producto : listProductos) { %>
			<tr>
				<td><%=producto.getNombre()%></td>
				<td><%=producto.getPrecio()%></td>
			</tr>
	<%} %>
	</table>
	<a href="inicio.html">Volver a home</a>


</body>
</html>