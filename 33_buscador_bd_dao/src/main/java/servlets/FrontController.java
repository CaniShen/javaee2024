package servlets;

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
		String urlVista="";
		String operation=request.getParameter("operation");
		urlVista=switch(operation) {
			case "doAgregar"-> {
				request.getRequestDispatcher("AgregarAction").include(request, response);
				yield "menu.html";
			}
			case "doEliminar"-> {
				request.getRequestDispatcher("EliminarAction").include(request, response);
				yield "menu.html";
			}
			case "doBuscar"-> {
				request.getRequestDispatcher("BuscarAction").include(request, response);
				yield "resultado.jsp";
			}
			case "doBuscarResultados"-> {
				request.getRequestDispatcher("BuscarResultadosAction").include(request, response);
				yield "resultados.jsp";
			}
			case "toAlta"->"alta.html";
			case "toBuscar"->"buscar.html";
			case "toEliminar"->"eliminar.html";
			case "toBuscarResultados"->"buscarResultados.html";
			default ->"menu.html";
			
			
		};
		
		request.getRequestDispatcher(urlVista).forward(request, response);
		}
	}

