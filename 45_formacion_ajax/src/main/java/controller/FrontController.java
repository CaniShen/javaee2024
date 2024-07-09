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

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String urlView = "";
		String operation = request.getParameter("operation");
		switch (operation) {
		case "doBuscar" -> {
			request.getRequestDispatcher("BuscarController").forward(request, response);
			return;
		}
		case "doEliminar" -> {
			request.getRequestDispatcher("EliminarController").include(request, response);
			urlView = "eliminar.jsp";
		}

		case "doGuardar" -> {
			request.getRequestDispatcher("GuardarController").include(request, response);
			urlView = "nuevo.jsp";
		}
		case "doLogin" -> {
			request.getRequestDispatcher("LoginController").include(request, response);
			urlView = (Boolean) request.getAttribute("autenticado") ? "menu.html" : "error.jsp";
		}
		case "doModificar" -> {
			request.getRequestDispatcher("ModificarController").include(request, response);
			urlView = "modificar.jsp";
		}
		case "toNuevo" -> urlView = "nuevo.jsp";
		case "toBuscar" -> urlView = "buscar.html";
		case "toEliminar" -> urlView = "eliminar.jsp";
		case "toMenu" -> urlView = "menu.html";
		case "toModificar" -> urlView = "modificar.jsp";
		default -> urlView = "login.html";

		}
		;

		request.getRequestDispatcher(urlView).forward(request, response);
	}
}
