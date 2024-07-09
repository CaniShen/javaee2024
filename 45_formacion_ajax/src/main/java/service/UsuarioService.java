package service;

import dao.UsuarioDao;

public class UsuarioService {
	UsuarioDao dao=new UsuarioDao();
	
	public boolean autenticar(String usuario, String pwd) {
		return dao.findByUsuarioAndPassword(usuario, pwd)!=null;
			
	}

	

	
}
