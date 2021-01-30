package br.com.projetoVerao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projetoVerao.model.Cliente;

/**
 *
 * @author Equipe Senac
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
