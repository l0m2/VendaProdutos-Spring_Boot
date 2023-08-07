package lojaVirtual.repositorios;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lojaVirtual.Models.produtoModel;

@Repository
public interface produtoRepository extends JpaRepository<produtoModel,UUID> {

}