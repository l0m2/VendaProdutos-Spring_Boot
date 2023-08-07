package lojaVirtual.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lojaVirtual.Models.clienteModel;
import lojaVirtual.repositorios.clienteRepository;

@Service
public class clienteServices {

	final clienteRepository clienteR;

	public clienteServices(clienteRepository clienteR) {
		this.clienteR = clienteR;
	}
@Transactional
	public clienteModel save(clienteModel clienteM) {
		// TODO Auto-generated method stub
		return clienteR.save(clienteM);
	}
/*
public boolean existeTelefone(String telefoneCliente) {
	// TODO Auto-generated method stub
	return clienteR.existeTelefone(telefoneCliente) ;
}*/
public List<clienteModel> findAll() {
	// TODO Auto-generated method stub
	return clienteR.findAll();
}
public Optional<clienteModel> findById(UUID id) {
	// TODO Auto-generated method stub
	return clienteR.findById(id);
}
@Transactional
public void delete(clienteModel clienteModel) {
	// TODO Auto-generated method stub
	clienteR.delete(clienteModel);
}
	
	
	 
	
}
