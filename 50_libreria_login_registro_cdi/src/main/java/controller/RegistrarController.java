package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.ClientesDao;
import dtos.ClienteDto;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mappers.Mapeador;
import service.ClientesService;


@WebServlet("/RegistrarController")
public class RegistrarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	ClientesService service;
	ClientesDao clientesDao;
	Mapeador mapeador;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		int telefono=Integer.parseInt(request.getParameter("telefono"));
		//no tenemos el nombre de tema para crear el TemaDto, ni falta que hace
		ClienteDto cliente=new ClienteDto(usuario,password,email,telefono);
	
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		out.print(clientesDao.save(cliente));1
	}

}
