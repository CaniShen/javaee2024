package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductosService;

@WebServlet("/AgregarAction")
public class AgregarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductosService productosService=new ProductosService();
		productosService.añadirProducto(new Producto(request.getParameter("nombre"),
				Double.parseDouble(request.getParameter("precio")),
				request.getParameter("categoria")));
		
		
		
	}

}
