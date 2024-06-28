package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import service.UsuarioService;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioService service = new UsuarioService();
		boolean result=service.autenticar(request.getParameter("usuario"), request.getParameter("password"));
		//el resultado de la autenticación lo guardamos en un atributo de petición
		//para que lo pueda utilizar el FC
		request.setAttribute("autenticado", result);
		System.out.println(result);
		if(result) {
			request.getSession().setAttribute("usuario", request.getParameter("usuario"));
		}

	}

}
