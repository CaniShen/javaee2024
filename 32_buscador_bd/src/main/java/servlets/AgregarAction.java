package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

@WebServlet("/AgregarAction")
public class AgregarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BuscadorService buscadorservice=new BuscadorService();
		buscadorservice.altaResultado(new Resultado(0, request.getParameter("url"),
				request.getParameter("tematica"),
				request.getParameter("descripcion")));
	}

}
