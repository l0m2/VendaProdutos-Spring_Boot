package lojaVirtual.repositorios;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lojaVirtual.Models.compraModel;

@Repository
public interface compraRepository extends JpaRepository<compraModel,UUID> {

}