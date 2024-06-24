package servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ContadorLikes")
public class ContadorLikes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int contador=1;
		String nombre=request.getParameter("opcion");
		//Obtiene el objeto ServletContext
		//que es el mismo para todo los usuarios
		ServletContext context=request.getServletContext();
		
			contador=(int)context.getAttribute(nombre);
			contador++;
		
			context.setAttribute(nombre, contador);

		request.getRequestDispatcher("like.jsp").forward(request, response);
		
	}

}
