package br.com.projetoVerao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projetoVerao.model.Estoque;

/**
 *
 * @author Equipe Senac
 */
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    
}
