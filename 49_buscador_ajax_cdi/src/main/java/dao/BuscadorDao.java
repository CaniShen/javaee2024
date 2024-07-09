package dao;

import java.util.List;

import model.Resultado;

public interface BuscadorDao {

	void save(Resultado resultado);

	Resultado findByUrl(String url);

	Resultado findById(int idResultado);

	void delateById(int idResultado);

	List<Resultado> findByTematica(String tematica);

}