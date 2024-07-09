package service;

import java.util.List;

import dao.LibrosDao;
import dao.TemasDao;
import model.Libro;
import model.Tema;

public class LibrosService {
	LibrosDao librosDao=new LibrosDao();
	TemasDao temasDao=new TemasDao();
	
	public List<Tema> getTema() {
		return temasDao.findAll();
	}
	
	public List<Libro> librosTema(int idTema){
		if(idTema!=0) {
			return librosDao.findByTema(idTema);
		}else {
			return librosDao.findAll();
		}
	}

}
