package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductosService;
@WebServlet("/EliminarProductoServlet")
public class EliminarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductosService productosService=new ProductosService();
		productosService.eliminar(request.getParameter("nombre"));
		//guardamos productos en atributo de petición
		request.getRequestDispatcher("inicio.html").forward(request, response);
	}

}
