package lojaVirtual.services;

import org.springframework.stereotype.Service;

import lojaVirtual.repositorios.compraRepository;

@Service
public class compraServices {
   
	final compraRepository compraR;

	public compraServices(compraRepository compraR) {
		this.compraR = compraR;
	}
	
}
