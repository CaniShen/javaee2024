package controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ClientesService;

import java.io.IOException;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	ClientesService service;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			boolean result=service.autenticar(request.getParameter("usuario"), request.getParameter("password"));
			//el resultado de la comprobación lo guardamos en un atributo de petición para que lo pueda utilizar el FC
			request.setAttribute("autenticado", result);
			System.out.println(result);
			if(result) {
				request.getSession().setAttribute("usuario", request.getParameter("usuario"));
			}
	}

}
