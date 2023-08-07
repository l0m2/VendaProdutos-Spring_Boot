package lojaVirtual.repositorios;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lojaVirtual.Models.clienteModel;

@Repository
public interface clienteRepository extends JpaRepository<clienteModel,UUID> {

	
	//boolean existeTelefone(String telefoneCliente);
}
