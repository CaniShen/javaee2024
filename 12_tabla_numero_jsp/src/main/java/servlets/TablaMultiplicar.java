package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TablaNumero")
public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int numero=Integer.parseInt(request.getParameter("numero"));
			RequestDispatcher dispatcher;
			if(numero)
			try(PrintWriter out=response.getWriter()) {
				
				out.println("<html><head></head><body><center>");
				out.println("<h2>Tabla del "+ numero+"</h2>");
				out.println("<table border='1'>");
				
				for( int i=1; i<=10;i++) {
					out.println("<tr>");
					out.println("<td>"+numero+"X"+i+"</td>");
					out.println("<td>"+numero*i+"</td>");
					out.println("</tr>");
	
				}
				out.println("</table></center>");
				out.println("<a href='numero.html'>Volver</a></body></html>");
				
			}
	}

}
