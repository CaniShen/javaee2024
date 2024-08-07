package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("operation");
		String urlView="";
		switch(operation) {
		case "doTemas":
			request.getRequestDispatcher("TemasController").include(request, response);
			urlView="visor.jsp";
			break;
		case "doLibros":
			request.getRequestDispatcher("LibrosController").forward(request, response);
			return;// en peticiones AJAX la respuesta la lleva a cabo
					// eñ servlet controlador
		case "doAgregarCarrito":
			request.getRequestDispatcher("AgregarCarritoController").forward(request, response);
			return;//en peticiones AJAX la respuesta la lleva a cabo
						//el servlet controlador
		case "doQuitarCarrito":
			request.getRequestDispatcher("QuitarCarritoController").forward(request,response);
			return;//en peticiones AJAX la respuesta la lleva a cabo
					//el servlet controlador
		case "doPaginaNuevo":
			request.getRequestDispatcher("TemasController").include(request, response);
			urlView="alta.jsp";
			break;
		case "doLogin":
			request.getRequestDispatcher("LoginController").include(request, response);
			urlView=(boolean)request.getAttribute("autenticado")?"index.html":"registro.html";
			break;
		
		case "doAltaLibro":
			request.getRequestDispatcher("AltaLibroController").forward(request, response);
			return;// en peticiones AJAX la respuesta la lleva a cabo
					//el servlet controlador
		case "doRegistrar":
				request.getRequestDispatcher("RegistroController").forward(request, response);
				return;//en petición AJAX la respuesta la lleva a cabo
						//el servlet controlador
		case "toRegistro"://petición desde enlace"Resgistrese"
				urlView="registro.html";
				break;
		case "toLogin":
			urlView="login.html";
				break;
		default:
			urlView="index.html";
		
		}

		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
