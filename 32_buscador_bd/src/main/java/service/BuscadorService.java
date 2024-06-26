package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Resultado;

public class BuscadorService {
	
	private EntityManager eManager;
	public BuscadorService() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("buscador");// el nombre de persisitencia 
		eManager=factory.createEntityManager();
	}
	public void altaResultado(Resultado resultado) {
		eManager.persist(resultado);
		
	}
	
	public Resultado buscarResultadoPorId(int idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void eliminarResultado(int idResultado) {
		eManager.remove(eManager);
	}
	
 
}
