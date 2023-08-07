package lojaVirtual.Controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lojaVirtual.Models.clienteModel;
import jakarta.validation.Valid;
import lojaVirtual.Validacao.clienteDTO;
import lojaVirtual.services.clienteServices;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/cliente")
public class clienteController {

	final clienteServices clienteS;

	public clienteController(clienteServices clienteS) {
		this.clienteS = clienteS;
	}
	
@PostMapping
public ResponseEntity<Object> salvaCliente(@RequestBody @Valid clienteDTO clienteD){
	/*
	if(clienteS.existeTelefone(clienteD.getTelefoneCliente())) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body("O de numero telefone ja existe");
	}
	*/
	
	var clienteM = new clienteModel();
	
	BeanUtils.copyProperties(clienteD, clienteM);
	return ResponseEntity.status(HttpStatus.CREATED).body(clienteS.save(clienteM));

}

@GetMapping
public ResponseEntity<List<clienteModel>>allClientes(){
	
	return ResponseEntity.status(HttpStatus.OK).body(clienteS.findAll());
}
	
@GetMapping("/{id}")
public ResponseEntity<Object>oneCliente(@PathVariable(value="id") UUID id){
	Optional<clienteModel> clienteO = clienteS.findById(id);
	return ResponseEntity.status(HttpStatus.OK).body(clienteO.get());
}

@DeleteMapping("/{id}")
public ResponseEntity<Object>deleteCliente(@PathVariable(value="id")UUID id){
	Optional<clienteModel> clienteO = clienteS.findById(id);
	clienteS.delete(clienteO.get());
	return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
	
}

@PutMapping("/{id}")
public ResponseEntity<Object>updateCliente(@PathVariable(value="id") UUID id, @RequestBody @Valid clienteDTO clienteD){
	Optional<clienteModel> clienteO = clienteS.findById(id);
	var clienteM = new clienteModel();
	BeanUtils.copyProperties(clienteD,clienteM );
	return ResponseEntity.status(HttpStatus.OK).body(clienteS.save(clienteM));
	
}

}
