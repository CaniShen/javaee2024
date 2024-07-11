package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

@WebServlet("/BuscarAction")
public class BuscarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BuscadorService buscadorservice=new BuscadorService();
		Resultado resultado=buscadorservice.buscarResultadoPorId(Integer.parseInt((request.getParameter("idResultado"))));
		request.setAttribute("resultado", resultado);
		
	}

}
