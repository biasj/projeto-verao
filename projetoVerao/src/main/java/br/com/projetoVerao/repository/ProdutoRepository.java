package br.com.projetoVerao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projetoVerao.model.Produto;

/**
 *
 * @author Equipe Senac
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    

}
