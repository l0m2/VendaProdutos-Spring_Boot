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

import jakarta.validation.Valid;
import lojaVirtual.Models.produtoModel;
import lojaVirtual.Validacao.produtoDTO;
import lojaVirtual.services.produtoServices;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/produto")
public class produtoController {

	final produtoServices produtoS;

	public produtoController(produtoServices produtoS) {
		this.produtoS = produtoS;
	}
	
@PostMapping
public ResponseEntity<Object> salvaCliente(@RequestBody @Valid produtoDTO produtoD){
	/*
	if(clienteS.existeTelefone(clienteD.getTelefoneCliente())) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body("O de numero telefone ja existe");
	}
	*/
	
	var produtoM = new produtoModel();
	
	BeanUtils.copyProperties(produtoD, produtoM);
	return ResponseEntity.status(HttpStatus.CREATED).body(produtoS.save(produtoM));

}

@GetMapping
public ResponseEntity<List<produtoModel>>allProdutos(){
	
	return ResponseEntity.status(HttpStatus.OK).body(produtoS.findAll());
}
	
@GetMapping("/{id}")
public ResponseEntity<Object>oneProduto(@PathVariable(value="id") UUID id){
	Optional<produtoModel> produtoO = produtoS.findById(id);
	return ResponseEntity.status(HttpStatus.OK).body(produtoO.get());
}

@DeleteMapping("/{id}")
public ResponseEntity<Object>deleteCliente(@PathVariable(value="id")UUID id){
	Optional<produtoModel> produtoO = produtoS.findById(id);
	produtoS.delete(produtoO.get());
	return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
	
}

@PutMapping("/{id}")
public ResponseEntity<Object>updateCliente(@PathVariable(value="id") UUID id, @RequestBody @Valid produtoDTO produtoD){
	Optional<produtoModel> produtoO = produtoS.findById(id);
	var produtoM = new produtoModel();
	BeanUtils.copyProperties(produtoD,produtoM );
	return ResponseEntity.status(HttpStatus.OK).body(produtoS.save(produtoM));
	
}
}
