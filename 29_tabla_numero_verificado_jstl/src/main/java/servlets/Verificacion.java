package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Verificacion")
public class Verificacion extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
			try(PrintWriter out=response.getWriter()) {
				
				Integer.parseInt(request.getParameter("numero"));
				request.getRequestDispatcher("tabla.jsp").forward(request, response);
			}catch(NumberFormatException ex) {
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		}

	}

			