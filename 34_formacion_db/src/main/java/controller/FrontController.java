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
		String urlVista="";
		String operation=request.getParameter("operation");
		urlVista=switch(operation) {
			case "doLogin"-> {
				request.getRequestDispatcher("LoginController").include(request, response);
				yield (Boolean)request.getAttribute("autenticado")? "menu.html":"error.jsp";
			}
			case "doEliminar"-> {
				request.getRequestDispatcher("EliminarController").include(request, response);
				yield "eliminar.jsp";
			}
			case "doBuscar"-> {
				request.getRequestDispatcher("BuscarController").include(request, response);
				yield "cursos.jsp";
			}
			case "doGuardar"->{
				request.getRequestDispatcher("GuardarController").include(request, response);
				yield "nuevo.jsp";
			}
			case "doModificar"->{
				request.getRequestDispatcher("ModificarController").include(request, response);
				yield "modificar.jsp";
			}
			case "toNuevo"->"nuevo.jsp";
			case "toBuscar"->"buscar.html";
			case "toEliminar"->"eliminar.jsp";
			case "toMenu"->"menu.html";
			case "toModificar"->"modificar.jsp";
			default ->"login.html";
			
			
		};
		
		request.getRequestDispatcher(urlVista).forward(request, response);
		}
	}

