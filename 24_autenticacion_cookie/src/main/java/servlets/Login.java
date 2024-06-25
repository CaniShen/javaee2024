package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.UsuariosService;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosService service=new UsuariosService();
		RequestDispatcher dispatcher;
		if(service.autenticar(request.getParameter("usuario"), 
					request.getParameter("password"))) {	
			Ficha ficha=service.fichaUsuario(request.getParameter("usuario"));
			request.setAttribute("ficha", ficha);
			//la cookie solo la creamos si se decide recordar el usuario
			if(request.getParameter("remember")!=null)  {
				crearCookie(response,request.getParameter("usuario"));
			}
			//transferimos petición a correcto.jsp
			dispatcher=request.getRequestDispatcher("bienvenida.jsp");
			
		}else {
			//transferimos petición a error.jsp
			dispatcher=request.getRequestDispatcher("error.jsp");
		}
		dispatcher.forward(request, response);
	}
	
	private void crearCookie(HttpServletResponse response,String usuario) {
		Cookie cookie= new Cookie("usuario", usuario);
			cookie.setMaxAge(10_000_000);
		response.addCookie(cookie);
	}


}
