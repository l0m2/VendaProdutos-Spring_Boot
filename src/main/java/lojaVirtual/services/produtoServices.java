package lojaVirtual.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lojaVirtual.Models.produtoModel;
import lojaVirtual.repositorios.produtoRepository;

@Service
public class produtoServices {

	
	final produtoRepository produtoR;

	public produtoServices(produtoRepository produtoR) {
		this.produtoR = produtoR;
	}
@Transactional
	public produtoModel save(produtoModel produtoM) {
		// TODO Auto-generated method stub
		return produtoR.save(produtoM);
	}
public List<produtoModel> findAll() {
	// TODO Auto-generated method stub
	return produtoR.findAll();
}
public Optional<produtoModel> findById(UUID id) {
	// TODO Auto-generated method stub
	return produtoR.findById(id);
}

@Transactional
public void delete(produtoModel produtoModel) {
	// TODO Auto-generated method stub
	produtoR.delete(produtoModel);
}
	
}
