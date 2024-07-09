package service;

import dao.ClientesDao;
import dtos.ClienteDto;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import mappers.Mapeador;
@Named
public class ClientesServiceImpl implements ClientesService {
	@Inject
	ClientesDao clientesDao;
	@Inject
	Mapeador mapeador;
	@Override
	public boolean autenticar(String usuario, String password) {
		
			if(clientesDao.findByUsuario(usuario).equals(usuario)
					&&clientesDao.findByUsuario(password).equals(password)) {
				return true;
		}
		return false;
		
	}

	@Override
	public boolean registrar(ClienteDto cliente) {
		if(clientesDao.findByUsuario(cliente.getUsuario())!=null) {
			return false;
		}
		clientesDao.save(mapeador.clienteDtoToEntity(cliente));
		return true;
	}

}
